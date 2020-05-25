package edu.ubb.reactivespring.functionaldemo.repository;

import edu.ubb.reactivespring.functionaldemo.model.DeliveryModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DeliveryRepository extends ReactiveCrudRepository<DeliveryModel, String> {
}
//public interface DeliveryRepository extends ReactiveMongoRepository<DeliveryModel, String> {
//}

