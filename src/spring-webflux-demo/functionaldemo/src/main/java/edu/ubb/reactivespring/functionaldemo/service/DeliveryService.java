package edu.ubb.reactivespring.functionaldemo.service;

import edu.ubb.reactivespring.functionaldemo.model.DeliveryModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Defines the business services for interacting with Books.
 */
public interface DeliveryService {
    /**
     * Finds a delivery by its id.
     * @param id    The id of the delivery to find.
     * @return      A Delivery, wrapped in a Mono.
     */
    Mono<DeliveryModel> findById(String id);

    /**
     * Returns all deliveries  in the database.
     * @return      A collection of DeliveryModels , wrapped in a Flux.
     */
    Flux<DeliveryModel> findAll();

    /**
     * Persists a Delivery to the database.
     * @param delivery  The DeliveryModel to save to the database.
     * @return      The saved delivery, wrapped in a Mono.
     */
    Mono<DeliveryModel> save(DeliveryModel delivery);

    /**
     * Deletes the DeliveryModel with the specified id.
     * @param id    The id of the DeliveryModel to delete.
     * @return      A Mono<Void>, which sends a completion notification when the deletion is finished.
     */
    Mono<Void> deleteById(String id);
}
