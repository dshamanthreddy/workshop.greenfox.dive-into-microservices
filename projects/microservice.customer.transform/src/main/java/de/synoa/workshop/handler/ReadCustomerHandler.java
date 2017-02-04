package de.synoa.workshop.handler;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class ReadCustomerHandler {

    @Handler
    public DBObject handle(@Body String objectId) {

        BasicDBObject query = new BasicDBObject("_id", new ObjectId(objectId));

        return query;
    }

}
