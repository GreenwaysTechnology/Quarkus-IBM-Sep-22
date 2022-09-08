package com.ibm.service;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Singleton;

@ApplicationScoped
//@Singleton
//@RequestScoped
//@SessionScoped
public class GreetingService {

    public GreetingService() {
        System.out.println("Greeting Service Object is created!!");
    }

    public String sayHello() {
        return "Hello From Service";
    }

    public String sayHai() {
        return "Hai";
    }

}
