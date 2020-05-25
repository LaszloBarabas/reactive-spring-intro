
package edu.ubb.reactivespring.functionaldemo.webapi;


import edu.ubb.reactivespring.functionaldemo.model.DeliveryModel;
import edu.ubb.reactivespring.functionaldemo.service.DeliveryService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class DeliveryHandler {
    private final DeliveryService deliveryService;

    public DeliveryHandler(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(deliveryService.findById(id), DeliveryModel.class);
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(deliveryService.findAll(), DeliveryModel.class);
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        final Mono<DeliveryModel> delivery = request.bodyToMono(DeliveryModel.class);

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(delivery.flatMap(deliveryService::save), DeliveryModel.class));
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(deliveryService.deleteById(id), Void.class);

    }
}
