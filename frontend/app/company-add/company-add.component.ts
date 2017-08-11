import { Component } from '@angular/core';

import { MessageService } from '../message.service';
import { CompanyService } from '../company.service';
import { Message } from '../message.model';

@Component({
	selector: 'company-add',
	template: `
	<form (submit)="sendCompany()" ngNativeValidate appMessage="div#messages">
		<h3>Ajouter une entreprise</h3>
		<div class="form-group">
			<label for="siren">Numéro SIREN :</label>
			<input id="siren" name="siren" class="form-control" [(ngModel)]="company.siren" required minlength="9" maxlength="9">
		</div>
		<div class="form-group">
			<label for="name">Nom :</label>
			<input id="name" name="name" class="form-control" [(ngModel)]="company.name">
		</div>
		<div class="form-group">
			<label for="postalCode">Code postal :</label>
			<input id="postalCode" name="postalCode" class="form-control" [(ngModel)]="company.postalCode">
		</div>
		<div class="form-group">
			<label for="city">Ville :</label>
			<input id="city" name="city" class="form-control" [(ngModel)]="company.city">
		</div>
		<div id="ajout_actions">
			<input type="submit" value="Valider">
			<input type="submit" value="Annuler">
		</div>
	</form>
	`
})
export class CompanyAddComponent {
	company: any;

	constructor(private companyService: CompanyService, private messageService: MessageService) {
		this.company = {};
	}

	public sendCompany() {
		this.companyService.add(this.company).subscribe((data:any) => {
			this.company = {};
			this.messageService.addMessage({
				level: 'info',
				content: 'Entreprise ajoutée avec succès !'
			});
		});
	}
}