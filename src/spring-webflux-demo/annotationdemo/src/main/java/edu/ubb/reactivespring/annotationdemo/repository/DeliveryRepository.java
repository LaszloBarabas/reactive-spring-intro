package edu.ubb.reactivespring.annotationdemo.repository;

import edu.ubb.reactivespring.annotationdemo.model.DeliveryModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DeliveryRepository extends ReactiveCrudRepository<DeliveryModel, String> {
}
//public interface DeliveryRepository extends ReactiveMongoRepository<DeliveryModel, String> {
//}

