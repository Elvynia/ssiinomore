import { Component, OnInit } from '@angular/core';

import { CompanyService } from '../company.service';
import { EvalService } from '../eval.service';

@Component({
	selector: 'company-eval',
	template: `
	<form id="grosbloc_add" (submit)="sendEval()">
		<h3>Evaluer une entreprise</h3>
		<div class="colonne">
			<label for="entreprise">Liste des entreprises :</label>
			<select [(ngModel)]="eval.siren" name="siren">
				<option *ngFor="let entreprise of companies" value="{{entreprise.siren}}">{{entreprise.nom}}</option>
			</select>

			<div>
				<p class="msg_entreprise_notfound">Vous ne trouvez pas votre entreprise ? <br /><a href="#add">Ajoutez là</a></p>
			</div>

			<label for="typecontrat">Type de contrat</label>
			<select [(ngModel)]="eval.contractStatus" name="status">
				<option value="CDI">CDI</option>
				<option value="CDD">CDD</option>
				<option value="Mission">Mission</option>
			</select>	
		</div>
		<div class="colonne">
			<label for="dureecontrat">Durée du contrat : </label>

			<input [(ngModel)]="eval.duration" type="number" name="duree_mois" value="0" min="0" max="11"> Mois 

			<div>
				<label for="poste">Poste :</label>
				<input [(ngModel)]="eval.title" type="text" name="poste">
			</div>

			<label for="avis">Avis :</label> 
			<a (click)="eval.avis = 1"><img src="resources/img/smileys_01.png" style="padding-right: 15px" alt="Evaluation positive de cette entreprise" title="Evaluation positive de cette entreprise"/></a>
			<a (click)="eval.avis = -1"><img src="resources/img/smileys_02.png" alt="Evaluation négative de cette entreprise" title="Evaluation négative de cette entreprise"/></a>
		</div>
		<div id="ajout_actions">
			<input type="submit" value="Valider">
			<input type="reset" value="Annuler">
		</div>
	</form>
	`
})
export class CompanyEvalComponent implements OnInit {
	companies: object[];
	eval: object;

	constructor(private companyService: CompanyService,
		private evalService: EvalService) {
		this.eval = {};
	}

	ngOnInit() {
		this.companyService.getAll().subscribe((data:object[]) => this.companies = data);
	}

	sendEval() {
		this.evalService.add(this.eval).subscribe((data:object) => {
			//FIXME: event to reload filters ?
		});
	}
}