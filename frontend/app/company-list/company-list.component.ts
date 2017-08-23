import { Component, Input, OnInit } from '@angular/core';

import { Observable } from 'rxjs/Rx';
import 'rxjs/add/observable/of';

import { CompanyService } from '../company.service';

@Component({
	selector: 'company-list',
	template: `
		<div class="company-list">
			<h3>{{title}}</h3>
			<table>
				<tbody>
					<tr *ngFor="let company of filteredData | async | slice:0:limit; let i = index;">
						<td>{{i + 1}}.</td>
						<td>{{company.nom}}</td>
						<td>{{company.ville}}</td>
					</tr>
				</tbody>
			</table>
			<p class="moreentreprise" *ngIf="filteredData && filteredData.length > defaultLimit"><a (click)="switchLimit()">{{ limitOn ? 'Plus' : 'Moins' }} d'entreprises</a></p>
		</div>
	`
})
export class CompanyListComponent implements OnInit {
	@Input() title: string;
	@Input() filter: (a:any, b:any) => number;
	private data: any[];
	filteredData: Observable<any[]>;
	limitOn: boolean;
	defaultLimit: number;

	get limit(): number {
		return this.limitOn ? this.defaultLimit : this.data.length;
	}

	constructor(private companyService: CompanyService) {
		this.defaultLimit = 10;
		this.limitOn = true;
	}

	ngOnInit() {
		this.companyService.getAll().subscribe((data: any[]) => {
			this.data = data;
			this.reloadFilter();
		});
	}

	public switchLimit() {
		this.limitOn = !this.limitOn;
	}

	private reloadFilter() {
		this.filteredData = Observable.of(this.data).map((list) => list.sort(this.filter));
	}
}