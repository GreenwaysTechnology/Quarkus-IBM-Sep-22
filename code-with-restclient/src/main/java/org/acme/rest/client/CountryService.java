package org.acme.rest.client;

import org.acme.rest.model.Country;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;
import java.util.Set;

@RegisterRestClient
@Path("/v3.1")
public interface CountryService {
    //api to invoke third party
    @Path("/name/{name}")
    @GET
    String getByName(@PathParam("name") String name);
}
