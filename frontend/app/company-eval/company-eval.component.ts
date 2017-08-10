import { Component, OnInit } from '@angular/core';

import { CompanyService } from '../company.service';
import { EvalService } from '../eval.service';
import { MessageService } from '../message.service';

@Component({
	selector: 'company-eval',
	template: `
	<form (submit)="sendEval()" ngNativeValidate appMessage="div#messages">
		<h3>Evaluer une entreprise</h3>
		<div class="colonne">
			<div class="form-group">
				<label for="entreprise">Liste des entreprises :</label>
				<select [(ngModel)]="eval.siren" name="siren" class="form-control" required>
					<option value=""></option>
					<option *ngFor="let entreprise of companies" value="{{entreprise.siren}}">{{entreprise.nom}}</option>
				</select>
			</div>
			<p class="msg_entreprise_notfound">
				Vous ne trouvez pas votre entreprise ?
				<br />
				<a href="#add">Ajoutez là</a>
			</p> 

			<div class="form-group">
				<label for="typecontrat">Type de contrat</label>
				<select [(ngModel)]="eval.contractStatus" name="status" class="form-control" required>
					<option value=""></option>
					<option value="CDI">CDI</option>
					<option value="CDD">CDD</option>
					<option value="Mission">Mission</option>
				</select>
			</div>
		</div>
		<div class="colonne">
			<div class="form-group">
				<label for="dureecontrat">Durée du contrat (mois) : </label>
				<input [(ngModel)]="eval.duration" type="number" name="duree_mois"
					min="0" max="11" class="form-control" required>
			</div>

			<div class="form-group">
				<label for="poste">Poste :</label>
				<input [(ngModel)]="eval.title" type="text" name="poste" class="form-control" required>
			</div>

			<div class="form-group avis-wrapper">
				<label for="avis">Avis :</label> 
				<a (click)="eval.avis = 1"><img src="resources/img/smileys_01.png" style="padding-right: 15px" alt="Evaluation positive de cette entreprise" title="Evaluation positive de cette entreprise"/></a>
				<a (click)="eval.avis = -1"><img src="resources/img/smileys_02.png" alt="Evaluation négative de cette entreprise" title="Evaluation négative de cette entreprise"/></a>
				<input id="avis" name="avis" [(ngModel)]="eval.avis" type="number" required/>
			</div>
		</div>
		<div id="ajout_actions">
			<input type="submit" value="Valider">
			<input type="reset" value="Annuler" (click)="eval = {}">
		</div>
	</form>
	`
})
export class CompanyEvalComponent implements OnInit {
	companies: object[];
	eval: object;

	constructor(private companyService: CompanyService,
		private evalService: EvalService,
		private messageService: MessageService) {
		this.eval = {};
	}

	ngOnInit() {
		this.companyService.getAll().subscribe((data:object[]) => this.companies = data);
	}

	sendEval() {
		this.evalService.add(this.eval).subscribe((data:object) => {
			this.eval = {};
			this.messageService.addMessage({
				level: 'success',
				content: 'L\'évaluation a été créé avec succès !'
			});
			//FIXME: event to reload filters ?
		});
	}
}