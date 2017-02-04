package de.synoa.workshop.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldRouteBuilder extends RouteBuilder {

    public void configure() throws Exception {

        // @formatter:off
		
		from("timer:helloworld?period=1000")
		  .log("{{workshop.greeting}}")
		;
		
        // @formatter:on
    }

}
