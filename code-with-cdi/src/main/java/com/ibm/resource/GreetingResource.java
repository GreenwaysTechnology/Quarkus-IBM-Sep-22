package com.ibm.resource;

import com.ibm.qualifiers.HaiQualifier;
import com.ibm.qualifiers.HelloQualifier;
import com.ibm.service.GreetingService;
import com.ibm.service.interfaces.Greeter;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greet")
public class GreetingResource {

    //dependency : HAS-A
//    private GreetingService greetingService = new GreetingService();
//    @Inject
//    private GreetingService greetingService;

    @Inject
    @HelloQualifier
    Greeter hellogreet;

    @Inject
    @HaiQualifier
    Greeter haiGreet;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        //return this.greetingService.sayHello();
        return hellogreet.sayGreet();
    }

    @GET
    @Path("/hai")
    public String hai() {
        //return this.greetingService.sayHello();
        return haiGreet.sayGreet();
    }
}