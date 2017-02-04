package de.synoa.workshop.handler;

import java.util.Date;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Header;
import org.apache.camel.component.mongodb.converters.MongoDbBasicConverters;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class CustomerImportHandler {

    @Handler
    public DBObject handle(@Body Object customers, @Header(Exchange.FILE_NAME_ONLY) String fileName,
            @Header(Exchange.FILE_LAST_MODIFIED) Date lastModified) {

        BasicDBObject result = new BasicDBObject();

        result.put("file_name", fileName);
        result.put("last_modified", lastModified);
        result.put("read", new Date());
        result.put("content", MongoDbBasicConverters.fromAnyObjectToDBObject(customers));

        return result;
    }
}