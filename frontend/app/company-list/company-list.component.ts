import { Component, Input } from '@angular/core';

@Component({
	selector: 'company-list',
	template: `
		<div class="company-list">
			<h3>{{title}}</h3>
			<table>
				<tbody>
					<tr *ngFor="let company of data">
						<td>{{company.id}}</td>
						<td>{{company.name}}</td>
						<td>{{company.city}}</td>
					</tr>
				</tbody>
			</table>
			<p class="moreentreprise"><a href="">Plus d'entreprises</a></p>
		</div>
	`
})
export class CompanyListComponent {
	@Input() title: string;
	@Input() filter: Function;
	data: Array<object> = [
		{ id:1,	name: 'Cap Gemini', city: 'Marseille (13ème)' },
		{ id:2,	name: 'Sfeir', city: 'Marseille (13ème)' },
		{ id:3,	name: 'Intitek', city: 'Marseille (13ème)' },
		{ id:4,	name: 'Umanis', city: 'Marseille (13ème)' },
		{ id:5,	name: 'Treeptik', city: 'Marseille (13ème)' },
		{ id:6,	name: 'ID.Apps', city: 'Marseille (13ème)' },
		{ id:7,	name: 'Asten Solution', city: 'Marseille (13ème)' },
		{ id:8,	name: 'BI Consulting', city: 'Marseille (13ème)' },
		{ id:9,	name: 'Sopra Steria', city: 'Marseille (13ème)' },
		{ id:10, name: 'Infotel', city: 'Marseille (13ème)' }
	];
}