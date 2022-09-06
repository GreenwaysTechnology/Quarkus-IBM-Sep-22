package org.ibm.resource.api;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/query")
public class QueryResource {

    //http://localhost:8080/query/books?copies=30&price=1200
    //no
    @Path("/books")
    @GET
    public String getBooks(@QueryParam("copies") @DefaultValue("0")  int copies, @QueryParam("price") @DefaultValue("0.0") double price) {
        return copies + "Books " + " " + price;
    }

}
