package de.synoa.workshop.handler;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Body;
import org.apache.camel.Handler;

import com.mongodb.BasicDBObject;

public class UpsertCustomerHandler {

    @Handler
    public List<BasicDBObject> handle(@Body BasicDBObject customer) {

        List<BasicDBObject> upsert = new ArrayList<BasicDBObject>(2);
        BasicDBObject query = new BasicDBObject("customernumber", customer.getString("customernumber"));

        upsert.add(query);
        upsert.add(new BasicDBObject("$set", customer));

        // System.out.println("\nquery: " + upsert.get(0));
        // System.out.println("\nupdate: " + upsert.get(1));

        return upsert;
    }
}
