import { Component, OnInit } from '@angular/core';

import { CompanyService } from '../company.service';

@Component({
	selector: 'company-eval',
	template: `
		<div id="grosbloc_add">
		<h3>Evaluer une entreprise</h3>
		<div class="colonne">
			<label for="entreprise">Liste des entreprises :</label>
			<select>
				<option *ngFor="let entreprise of companies">{{entreprise.nom}}</option>
			</select>

			<div>
				<p class="msg_entreprise_notfound">Vous ne trouvez pas votre entreprise ? <br /><a href="">Ajouter là</a></p>
			</div>

			<label for="typecontrat">Type de contrat</label>
			<select>
				<option>CDI</option>
				<option>CDD</option>
				<option>Mission</option>
			</select>	
		</div>
		<div class="colonne">
			<label for="dureecontrat">Durée du contrat : </label>

			<input type="number" name="duree_annee" value="0" min="0" max="64"> Année(s)
			<input type="number" name="duree_mois" value="0" min="0" max="11"> Mois 

			<div>
				<label for="poste">Poste :</label>
				<input type="text" name="poste">
			</div>

			<label for="avis">Avis :</label> 
			<a href=""><img src="resources/img/smileys_01.png" style="padding-right: 15px" alt="Evaluation positive de cette entreprise" title="Evaluation positive de cette entreprise"/></a>
			<a href=""><img src="resources/img/smileys_02.png" alt="Evaluation négative de cette entreprise" title="Evaluation négative de cette entreprise"/></a>
		</div>
		<div id="ajout_actions">
			<input type="submit" value="Valider">
			<input type="submit" value="Annuler">
		</div>
	</div>
	`
})
export class CompanyEvalComponent implements OnInit {
	companies: any[];

	constructor(private companyService: CompanyService) {}

	ngOnInit() {
		this.companyService.getAll().subscribe((data:any[]) => this.companies = data);
	}
}