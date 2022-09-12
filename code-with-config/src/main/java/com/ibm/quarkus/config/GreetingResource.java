package com.ibm.quarkus.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    //    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return greetingService.sayHello();
//    }
//
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/config")
    public String helloFromConfig() {
        return greetingService.sayHello();

    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/config/env")
    public String getEnvironment() {
        return greetingService.getEnv();

    }
}