package org.ibm.resource.api;

import javax.ws.rs.*;

@Path("/api/users")
public class UserResource {

    //return default users
    @GET
    public String list() {
        return "Users List";
    }

    //Path design
    @Path("/something")
    @GET
    public String something() {
        return "Something";
    }
    //regular expressions:  mini language for pattern matching
    //syntax :"{variable-Name[":" regularexpression]}"

    //api/users/bar
    //api/users/foo/bar
    //api/users/me/you/bar
    @Path("{foo:.*}/bar")
    @GET
    public String getInfo(){
       return "Info";
    }
    //dynamic pattern "{[]*}"

    //api/users/foo/stuff
    //api/users/bar/stuff
    @Path("/{variable}/stuff")
    @GET
    public String getInformation(){
        return  "Information";
    }

    //POST
    @POST
    public String save() {
        return "User Saved";
    }

    //PUT
    @PUT
    public String update() {
        return "User updated";
    }

    @DELETE
    //Delete Resource
    public String delete() {
        return "User deleted";
    }
}
