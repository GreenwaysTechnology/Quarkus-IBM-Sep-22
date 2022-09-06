package org.ibm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//HTTP://localhost:8080/api/
@Path("/api")
public class WelcomeResource {

    //api
    @GET
    @Path("/welcome")
    public String sayWelcome() {
        return "Welcome to Quarkus REST";
    }
}
