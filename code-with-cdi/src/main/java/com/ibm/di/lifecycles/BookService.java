package com.ibm.di.lifecycles;

import com.ibm.model.Book;
import com.ibm.service.interfaces.NumberGenerator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Singleton;

@ApplicationScoped
public class BookService {

    //Inject interface
    @Inject
    NumberGenerator numberGenerator;

    @PostConstruct
    public void init(){
        System.out.println("INIT");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy");
    }

    //biz method
    public Book createBook() {
        Book book = new Book("Quarks In Action", 1000f, "Subramanian");
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }
}