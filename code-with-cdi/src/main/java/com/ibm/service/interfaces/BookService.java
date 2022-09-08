package com.ibm.service.interfaces;

import com.ibm.model.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BookService {
    //Interface injection
    @Inject
    NumberGenerator numberGenerator;

    //biz method
    public Book createBook() {
        Book book = new Book("Quarks In Action", 1000f, "Subramanian");
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}
