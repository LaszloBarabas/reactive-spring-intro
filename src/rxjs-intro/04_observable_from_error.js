

var Rx = require('rx')


console.log(' Observable: create an Observable throwing an error   and react (write them out)') 


var firstObservable = Rx.Observable
                            .throw( new Error('Hello Reactive with Error'))




firstObservable
        .subscribe( 
            (item) => console.log(item), 
            (err)  => console.log(err.message)   
        )
