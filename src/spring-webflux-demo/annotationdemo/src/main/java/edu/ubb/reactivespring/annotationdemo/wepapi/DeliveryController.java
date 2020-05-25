package edu.ubb.reactivespring.annotationdemo.webapi;

import edu.ubb.reactivespring.annotationdemo.model.DeliveryModel;
import edu.ubb.reactivespring.annotationdemo.service.DeliveryService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DeliveryController {
    private static final Logger log = LoggerFactory.getLogger(DeliveryController.class); 
 
    private DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping(value = "/delivery/{id}")
    public Mono<DeliveryModel> getDeliveryById(@PathVariable String id) {
        return deliveryService.findById(id);
    }

    @GetMapping(value = "/deliveries")
    public Flux<DeliveryModel> getAllDeliveries() {
        //Thread.dumpStack();
            return deliveryService.findAll()
                .map( myd -> { 
                        log.info(" Stored the address: {}", myd.toAddress); 
                        return myd; 
                    }); 
        //return deliveryService.findAll();
    }

    @PostMapping(value = "/delivery")
    public Mono<DeliveryModel> createDelivery(@RequestBody DeliveryModel delivery) {
        log.info("updateDelivery  with  : {} ", delivery.toAddress);
        return deliveryService.save(delivery);
    }
}
