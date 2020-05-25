
var Rx = require('rx')


console.log(' Observable: create an Observable from a single value  and react (write them out)') 


var firstObservable = Rx.Observable
                            .return('Hello Reactive with return')


var secondObservable = Rx.Observable
                            .just('Hello Reactive with just')


firstObservable.subscribe( item => console.log(item))
secondObservable.subscribe( item => console.log(item))
