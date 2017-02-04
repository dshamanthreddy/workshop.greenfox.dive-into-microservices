package de.synoa.workshop.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mongodb.MongoDbConstants;
import org.springframework.stereotype.Component;

import de.synoa.workshop.handler.ReadCustomerHandler;
import de.synoa.workshop.handler.TransformRawCustomerHandler;
import de.synoa.workshop.handler.UpsertCustomerHandler;

@Component
public class CustomerTransformRouteBuilder extends RouteBuilder {

    public void configure() throws Exception {
        // @formatter:off
		
        from("activemq:de.synoa.workshop.microservice.customer.import.done")
            .log("${body}")
            
//            // Create the query to read the customer
//            .bean(ReadCustomerHandler.class)
//            .log("${body}")
//            
//            // Read the customer from MongoDB
//            .to("mongodb:mongodbConfig?database={{mongodb.database}}&collection=customers_import&operation=findOneByQuery")
//            .log("${body}")
//            
//            // Transform the raw customer
//            .bean(TransformRawCustomerHandler.class)
//            
//            // foreach transformed customer
//           .split(body())
//               .log("---")
//               .log("${body}")
//               
//               // Create the query to upsert the customer
//               .bean(UpsertCustomerHandler.class)
//               
//               // Set the header to upsert = insert or update
//               .setHeader(MongoDbConstants.UPSERT, constant(true))
//               
//               // Upsert transformed customer into MongoDB
//               .to("mongodb:mongodbConfig?database={{mongodb.database}}&collection=customers_transformed&operation=update")
//           .end()
            
        ;
		
        // @formatter:on
    }

}
