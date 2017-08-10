import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { CompanyAddComponent } from './company-add/company-add.component';
import { CompanyEvalComponent } from './company-eval/company-eval.component';
import { CompanyListComponent } from './company-list/company-list.component';
import { MessageDirective } from './message/message.directive';

import { Configuration } from './app.constants';
import { CompanyService } from './company.service';
import { EvalService } from './eval.service';
import { MessageService } from './message.service';

@NgModule({
	imports: [
		BrowserModule,
		HttpModule,
		FormsModule
	],
	declarations: [
		AppComponent,
		CompanyAddComponent,
		CompanyEvalComponent,
		CompanyListComponent,
		MessageDirective
	],
	providers: [
		Configuration,
		CompanyService,
		EvalService,
		MessageService
	],
	bootstrap:  [AppComponent]
})
export class AppModule {
	
}