
package edu.ubb.reactivespring.functionaldemo.webapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class DeliveryRouter {

    @Bean
    public RouterFunction<ServerResponse> route(DeliveryHandler handler) {
        return RouterFunctions
                .route(GET("/fdeliveries").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/fdelivery/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(POST("/fdelivery").and(accept(MediaType.APPLICATION_JSON)), handler::save)
                .andRoute(DELETE("/fdelivery/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
    }
}
