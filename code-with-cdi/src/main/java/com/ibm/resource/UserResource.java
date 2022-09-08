package com.ibm.resource;

import com.ibm.service.ReviewService;
import com.ibm.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api/users")
public class UserResource {

//    @Inject
//    private UserService userService;
    //private keyword is not necessary in CDI

//    @Inject
//    UserService userService;

    //setter injection
//    @Inject
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    @Inject
    UserService userService;
    @Inject
    ReviewService reviewService;

//    public UserResource() {
//    }
//
//    @Inject
//    public UserResource(UserService userService) {
//        this.userService = userService;
//    }

    @GET
    public Response list() {
        return Response.ok(userService.list()).build();
    }

    @GET
    @Path("/reviews")
    public Response getReviews() {
        return Response.ok(reviewService.getReviews()).build();
    }
}
