package com.ibm.di.lifecycles;

import com.ibm.model.Book;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/beanlife")
public class BookLifeCycleResource {


    @Inject
    BookService bookService;

    @GET
    public Book getBook() {
        return bookService.createBook();
    }
}
