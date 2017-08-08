import { Injectable } from '@angular/core';

@Injectable()
export class Configuration {
	readonly APP_API_URL: string = 'http://localhost:8080/ssiinomore/api';
}