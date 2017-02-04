package de.synoa.workshop.handler;

import java.util.ArrayList;

import org.apache.camel.Body;
import org.apache.camel.Handler;

import com.mongodb.BasicDBObject;

public class TransformRawCustomerHandler {

    @Handler
    public ArrayList<BasicDBObject> handle(@Body BasicDBObject rawCustomer) {

        ArrayList<BasicDBObject> transformedCustomers = new ArrayList<BasicDBObject>();

        BasicDBObject content = (BasicDBObject) rawCustomer.get("content");
        ArrayList<BasicDBObject> customers = (ArrayList<BasicDBObject>) content.get("customer");

        for (BasicDBObject customer : customers) {
            // Add customernumber
            customer.append("customernumber", customer.getString("customerID"));
            // Remove customerID
            customer.remove("customerID");

            // Add the customer to the result
            transformedCustomers.add(customer);
        }

        return transformedCustomers;

    }

}
