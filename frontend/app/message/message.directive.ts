import { Directive, Input, OnInit, Renderer } from '@angular/core';

import { MessageService } from '../message.service';
import { Message } from '../message.model';

@Directive({
	selector: '[appMessage]'
})
export class MessageDirective implements OnInit {
	@Input('appMessage') location: string;

	constructor(private renderer: Renderer, private messageService: MessageService) {}

	ngOnInit() {
		this.messageService.messages.subscribe((message: Message) => {
			let root = this.renderer.selectRootElement(this.location);
			let element = this.renderer.createElement(root, 'div');
			this.renderer.setElementClass(element, 'alert', true);
			this.renderer.setElementClass(element, 'alert-dismissable', true);
			this.renderer.setElementClass(element, 'alert-' + message.level, true);
			let strong = this.renderer.createElement(element, 'strong');
			let text = this.renderer.createText(strong, message.content);
			this.renderer.projectNodes(element, strong);
			this.renderer.projectNodes(root, element);
			this.buildCloseIcon(element);
		});
	}

	private buildCloseIcon(element: any) {
		let a = this.renderer.createElement(element, 'a');
		this.renderer.setElementAttribute(a, 'href', '#');
		this.renderer.setElementAttribute(a, 'aria-label', 'close');
		this.renderer.setElementAttribute(a, 'data-dismiss', 'alert');
		this.renderer.setElementClass(a, 'close', true);
		// FIXME: sanitize &times; ?
		let text = this.renderer.createText(a, 'x');
		this.renderer.projectNodes(element, a);
	}
}