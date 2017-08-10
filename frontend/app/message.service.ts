import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';

import { Observable, Subject } from 'rxjs/Rx';
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'

import { Configuration } from './app.constants';
import { Message } from './message.model';

@Injectable()
export class MessageService {
	private _messages: Subject<Message>;

	constructor() {
		this._messages = new Subject<Message>();
	}

	public get messages(): Observable<Message> {
		return this._messages.asObservable();
	}

	public addMessage(message: Message) {
		this._messages.next(message);
	}
}