package org.ibm.resource.api;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/library")
public class MatrixResource {
    //http://localhost:8080/library/books;name=QuarkusInACtion;author=Bill    @GET

    @Path("/books")
    public String getBookDetails(@MatrixParam("name") String name, @MatrixParam("author") String title) {
        return name + " " + title;
    }
}
