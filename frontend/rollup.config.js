export default {
  entry: 'dist/index.js',
  dest: 'dist/bundles/ssiinomore.umd.js',
  sourceMap: false,
  format: 'umd',
  moduleName: 'ssiinomore',
  globals: {
    '@angular/common': 'ng.common',
    '@angular/core': 'ng.core',
    '@angular/platform-browser': 'ng.platformBrowser',
    '@angular/platform-browser-dynamic': 'ng.platformBrowserDynamic',
    'rxjs/Rx': 'Rx',
    'rxjs/add/operator/map': 'Rx.Observable.prototype',
    'rxjs/add/operator/filter': 'Rx.Observable.prototype',
    'rxjs/add/observable/fromEvent': 'Rx.Observable',
    'rxjs/add/observable/of': 'Rx.Observable'
  },
  external: [
    '@angular/common',
    '@angular/core',
    '@angular/platform-browser',
    '@angular/platform-browser-dynamic',
    'rxjs/Rx'
  ]
}