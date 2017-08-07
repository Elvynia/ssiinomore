import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { CompanyAddComponent } from './company-add/company-add.component';
import { CompanyListComponent } from './company-list/company-list.component';

@NgModule({
	imports: [
		BrowserModule
	],
	declarations: [
		AppComponent,
		CompanyAddComponent,
		CompanyListComponent
	],
	bootstrap:  [AppComponent]
})
export class AppModule {
	
}