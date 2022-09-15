package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

//http://localhost:8080/hellorest/client

@RegisterRestClient(configKey = "hello-api")
@Path("/hellorest")
public interface HelloRestClientService {
    //api to invoke third party
    @Path("/client")
    @GET
    String sayHello();
}
