import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'

import { Configuration } from './app.constants';

@Injectable()
export class EvalService {
	private apiUrl: string;
	private headers: Headers;

	constructor(private httpClient: Http, private configuration: Configuration) {
		this.apiUrl = configuration.APP_API_URL + '/evaluation';
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

	public add = (_eval: any): Observable<any> => {
		return this.httpClient.put(this.apiUrl, {
				entreprise: {
					siren: _eval.siren
				},
				avis: _eval.avis,
				duree: _eval.duration,
				statutContractuel: _eval.contractStatus,
				posteOccupe: _eval.title,
				dateEval: new Date(),
				nbSignalements: 0
			}, {
			headers: this.headers,
		}).map((response: Response) => response.json())
		.catch(this.handleError);
	}

	private handleError(error: Response) {
        console.error(error);
        return Observable.throw(error.json() || 'Server error');
    }
}