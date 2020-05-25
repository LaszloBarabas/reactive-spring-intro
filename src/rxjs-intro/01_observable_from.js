
var Rx = require('rx')

console.log('first Observable: create a Observable from [0, 1, 2, 3, 4, 5, 6, 7] and react (write them out)') 
var firstObservable = Rx.Observable
                            .from([0, 1, 2, 3, 4, 5, 6, 7])


firstObservable.subscribe( item => console.log(item))
                

console.log('second Observable: create a Observable from [0, 1, 2, 3, 4, 5, 6, 7] duplicate them  and react (write them out)') 

var secondObservable = Rx.Observable
                            .from([0, 1, 2, 3, 4, 5, 6, 7], item => item * 2 )


secondObservable.subscribe( item => console.log(item))
