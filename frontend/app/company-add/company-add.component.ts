import { Component } from '@angular/core';

import { MessageService } from '../message.service';
import { Message } from '../message.model';

@Component({
	selector: 'company-add',
	template: `
	<form (submit)="sendCompany()" ngNativeValidate appMessage="div#messages">
		<h3>Ajouter une entreprise</h3>
		<div class="">
			
		</div>
		<div id="ajout_actions">
			<input type="submit" value="Valider">
			<input type="submit" value="Annuler">
		</div>
	</form>
	`
})
export class CompanyAddComponent {

	constructor(private messageService: MessageService) {}

	public sendCompany() {
		
	}
}