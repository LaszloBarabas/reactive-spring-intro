
var Rx = require('rx')

console.log(' Observable: create an Observable which will generate interger numbers at a predefined interval  and react (write them out)') 
var firstObservable = Rx.Observable
                            .interval(1000)


firstObservable.subscribe( item => console.log(item))
                

console.log(' Observable: create an Observable which will generate interger numbers after a time period and at a predefined interval  and react (write them out)') 
var secondObservable = Rx.Observable
                            .timer(1000, 500)


secondObservable.subscribe( item => console.log(item))
