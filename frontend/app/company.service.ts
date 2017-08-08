import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'

import { Configuration } from './app.constants';

@Injectable()
export class CompanyService {
	private apiUrl: string;
	private headers: Headers;

	constructor(private httpClient: Http, private configuration: Configuration) {
		this.apiUrl = configuration.APP_API_URL + '/entreprise';
		this.headers = new Headers();
		this.headers.append('Content-Type', 'application/json');
        this.headers.append('Accept', 'application/json');
	}

	public getAll = (): Observable<any> => {
		return this.httpClient.get(this.apiUrl, {
			headers: this.headers
		}).map((response: Response) => response.json())
		.catch(this.handleError);
	}

	private handleError(error: Response) {
        console.error(error);
        return Observable.throw(error.json() || 'Server error');
    }
}