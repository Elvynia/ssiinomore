import { Component } from '@angular/core';

@Component({
	selector: 'ssiinomore-app',
	template: `
		<div id="moduleBloc">
			<company-add></company-add>
			<div id="company-lists">
				<company-list title="Top 10"></company-list>
				<company-list title="Flop 10"></company-list>
			</div>
		</div>
	`
})
export class AppComponent {
	
}