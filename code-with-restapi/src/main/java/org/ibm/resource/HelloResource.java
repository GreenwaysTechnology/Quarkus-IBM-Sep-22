package org.ibm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
public class HelloResource {
    //api
    @GET
    @Path("/hello")
    public String sayHello() {
        return "Hello to Quarkus REST";
    }
}
