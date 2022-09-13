package com.ibm.ds.resource;

import com.ibm.ds.model.Person;
import com.ibm.ds.service.PersonService;

import javax.ws.rs.*;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/persons")
public class PersonResource {

    @Inject
    PersonService personService;

    @GET
    public Response findAll() {
        // return Response.ok().entity(Person.listAll()).build();
        return Response.ok().entity(personService.findAll()).build();
    }

    @GET
    @Path("/{name}")
    public Response findByName(@PathParam("name") String name) {
        // return Response.ok().entity(Person.listAll()).build();
        return Response.ok().entity(personService.findByName(name)).build();
    }


    @POST
    @Path("/create")
    public Response createPerson(Person person) {
        return Response.ok(personService.createPerson(person)).build();
    }
}