export * from './app/app.module';

import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule }              from './app/app.module';

platformBrowserDynamic().bootstrapModule(AppModule);