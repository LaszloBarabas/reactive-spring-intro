package edu.ubb.reactivespring.annotationdemo.service;

import edu.ubb.reactivespring.annotationdemo.model.DeliveryModel;
import edu.ubb.reactivespring.annotationdemo.repository.DeliveryRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    private DeliveryRepository deliveryRepository;

    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public Mono<DeliveryModel> findById(String id) {
        return deliveryRepository.findById(id);
    }

    @Override
    public Flux<DeliveryModel> findAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Mono<DeliveryModel> save(DeliveryModel delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return deliveryRepository.deleteById(id);
    }
}
