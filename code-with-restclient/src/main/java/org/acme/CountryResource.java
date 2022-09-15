package org.acme;

import org.acme.rest.client.CountryService;
import org.acme.rest.client.HelloRestClientService;
import org.acme.rest.model.Country;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Set;

@Path("/country")
public class CountryResource {

    @Inject
    @RestClient
    CountryService countryService;

    @Inject
    @RestClient
    HelloRestClientService helloRestClientService;

    @GET
    @Path("/name/{name}")
//    @Produces(MediaType.APPLICATION_JSON)
    public String findByCountry(@PathParam("name") String name) {
        return countryService.getByName(name);
    }

    @GET
    @Path("/hello")
    public String hello(){
        return helloRestClientService.sayHello();
    }

}