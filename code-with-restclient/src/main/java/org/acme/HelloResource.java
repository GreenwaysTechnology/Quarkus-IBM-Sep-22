package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hellorest")
public class HelloResource {
    @Inject
    HelloService helloService;

    @GET
    @Path("/client")
    public String sayHello() {
        return helloService.sayHello();
    }
}
