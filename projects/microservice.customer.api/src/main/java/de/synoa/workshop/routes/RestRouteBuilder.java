package de.synoa.workshop.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class RestRouteBuilder extends RouteBuilder {

    public void configure() throws Exception {
        // @formatter:off
        
        rest("/api")
            .get("/customer/{id}").produces(MediaType.APPLICATION_JSON_VALUE).to("direct:customer");

        from("direct:customer")
            .log("${headers.id}")
            .setBody(constant("{\"result\" : \"customer\"}"));
        
        // @formatter:on
    }

}