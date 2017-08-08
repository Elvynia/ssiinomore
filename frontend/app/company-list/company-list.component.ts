import { Component, Input, OnInit } from '@angular/core';

import { CompanyService } from '../company.service';

@Component({
	selector: 'company-list',
	template: `
		<div class="company-list">
			<h3>{{title}}</h3>
			<table>
				<tbody>
					<tr *ngFor="let company of data; let i = index;">
						<td>{{i + 1}}.</td>
						<td>{{company.nom}}</td>
						<td>{{company.ville}}</td>
					</tr>
				</tbody>
			</table>
			<p class="moreentreprise"><a href="#">Plus d'entreprises</a></p>
		</div>
	`
})
export class CompanyListComponent implements OnInit {
	@Input() title: string;
	@Input() filter: Function;
	data: any[];

	constructor(private companyService: CompanyService) {}

	ngOnInit() {
		this.companyService.getAll().subscribe((data: any[]) => this.data = data);
	}
}