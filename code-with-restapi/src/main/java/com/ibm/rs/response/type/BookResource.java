package com.ibm.rs.response.type;

import javax.validation.constraints.Max;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.util.List;

@Path("/api/books")
public class BookResource {

    //String
    @GET
    @Path("/book")
    @Produces(MediaType.TEXT_PLAIN) // the type of data format
    public String getBook() {
        return "Book"; //application/oct-type
    }

    @GET
    @Path("/show")
    //No Content is returned -204- HTTP
    public void showBook() {
        System.out.println("show Book");
    }

    @GET
    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON) //Not needed
    public Book getBookEntity() {
        //return book - Default Format - JSON
        return new Book("894343434", "Quarkus in Action", "Subramanian");
    }

    @GET
    @Path("/list")
    //@Produces(MediaType.APPLICATION_JSON)
    public List<Book> listBooks() {
        //return book
        return List.of(
                new Book("894343434", "Quarkus in Action", "Subramanian"),
                new Book("894343434", "Quarkus in Action", "Subramanian"),
                new Book("894343434", "Quarkus in Action", "Subramanian")
        );
    }
    //Response Object : Is used to send extra information(header,status code)

    @Path("/bookresponse")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    public Response getBookResponse() {
        Book book = new Book("894343434", "Quarkus in Action", "Subramanian");
        //Response includes - data ,status code
        return Response
                .status(Response.Status.OK)
                .entity(book)
                .header("myheader", "bar")
                .build();
    }

    //save
    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveBook(Book book) {
        System.out.println(book);
        //UriBuilder.fromResource(BookResource.class).build() this code will inject Location header
        //Location : http://localhost:8080/api/books
        //created -201
        return Response.created(UriBuilder.fromResource(BookResource.class).build()).build();
    }


}