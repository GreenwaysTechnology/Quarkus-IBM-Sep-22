package com.ibm.reactive.resource;

import com.ibm.reactive.service.WelcomeService;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class WelcomeResource {
    @Inject
    WelcomeService welcomeService;

    @GET
    @Blocking
    public Uni<String> sayHello() {
        System.out.println("SayHello Thread :" + Thread.currentThread().getName());
        return Uni.createFrom().item(welcomeService.sayHello());
    }
}
