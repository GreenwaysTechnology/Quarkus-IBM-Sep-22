package com.ibm.reactive.resource;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserResource {

    //api
    //this is handled by dedicated threads
    @GET
    public String getUser(){
        System.out.println("GET USER API Thread " + Thread.currentThread().getName());
        return "User";
    }

    //this is handled by event loop threads
    //reactive
    @GET
    @Path("/reactive")
    public Uni<String> getUserReactive(){
        System.out.println("getUserReactive Thread  : " + Thread.currentThread().getName());
        return Uni.createFrom().item("Hello Reactive");
    }
    @GET
    @Path("/reactive/multi")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<List<String>> getUsersReactive(){
        System.out.println("getUsersReactive Thread  : " + Thread.currentThread().getName());
        return Multi.createFrom().item(List.of("Subramanian","Ram","Arun"));
    }
}
