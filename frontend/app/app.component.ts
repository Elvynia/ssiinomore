import { Component, Renderer, OnInit } from '@angular/core';

@Component({
	selector: 'ssiinomore-app',
	template: `
		<div id="moduleBloc">
			<company-eval *ngIf="evaluating"></company-eval>
			<company-add *ngIf="!evaluating"></company-add>
			<div id="company-lists">
				<company-list title="Top 10"></company-list>
				<company-list title="Flop 10"></company-list>
			</div>
		</div>
	`
})
export class AppComponent implements OnInit {
	evaluating: boolean;
	private listener: Function = (event:HashChangeEvent|string) => {
		var anchor;
		if (event instanceof HashChangeEvent) {
			anchor = event.newURL && event.newURL.split('#')[1];
		} else if (event && event.length > 0) {
			anchor = event.split('#')[1];
		}
		if (anchor === 'evaluate') {
			this.evaluating = true;
		} else {
			this.evaluating = false;
		}
	};

	constructor(private renderer: Renderer) {
		renderer.listenGlobal('window', 'hashchange', this.listener);
	}

	ngOnInit() {
		this.listener(document.location.href);
	}
}