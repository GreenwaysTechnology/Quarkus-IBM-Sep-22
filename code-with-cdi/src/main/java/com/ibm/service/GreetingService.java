package com.ibm.service;


import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
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
