package de.synoa.workshop.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mongodb.MongoDbConstants;
import org.springframework.stereotype.Component;

import de.synoa.workshop.handler.CustomerImportHandler;

@Component
public class CustomerImportRouteBuilder extends RouteBuilder {

    public void configure() throws Exception {

        // @formatter:off

       /**
        * @see http://camel.apache.org/file2.html
        */
        
        // Read files from the specified directory
        from("file:{{customers.import.directory}}")
            // Validate the XML using the XSD
        	.to("validator:xsd/customers.xsd")
        	
        	// Log to content of the XML file to the terminal
        	.log("${body}")
        	
//        	// Convert the XML into a Java-Object
//        	.unmarshal().jaxb("de.synoa.workshop.customers")
//        	.log("unmarshalling done")
//        	
//        	// Convert Customers-Java-Object into MongoDB-Object
//        	.bean(CustomerImportHandler.class)
//        	.log("${body}")
//        	
//        	// Insert the MongoDB-Object into MongoDB
//        	.to("mongodb:mongodbConfig?database={{mongodb.database}}&collection=customers_import&operation=insert")
//        	.log("Insert into MongoDB done")
//        	
//        	// Get the MongoDB-document-ID from the header and set it as the body
//        	.setBody(header(MongoDbConstants.OID))
//            .convertBodyTo(String.class)
//            .log("MongoDB-document-ID: ${body}")
//            
//            // Save the ID as a message into an ActiveMQ queue
//            .to("activemq:de.synoa.workshop.microservice.customer.import.done");
        ;

        // @formatter:on

    }

}
