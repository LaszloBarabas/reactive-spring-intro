
Subscriber<String> subscriber = new Subscriber<String>() 
{
    volatile Subscription subscription;                            // (1) 

    public void onSubscribe(Subscription s) {                       // (2)
        subscription = s;                                         // (2.1)
        log.info("initial request for 1 element");                //
        subscription.request(1);                                  // (2.2)
    }
    
    public void onNext(String s) {                                  // (3)
        log.info("onNext: {}", s);                                   //
        log.info("requesting 1 more element");                       //
        subscription.request(1);                                     // (3.1)
    }

    public void onComplete()
    {
          log.info("onComplete");}publicvoidonError(Throwable t){
          log.warn("onError: {}", t.getMessage());
    }
};

Flux<String> stream = Flux.just("Hello","world","!");            // (4)
stream.subscribe(subscriber);    


