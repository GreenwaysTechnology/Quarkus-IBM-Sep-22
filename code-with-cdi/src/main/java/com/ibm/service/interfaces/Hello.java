package com.ibm.service.interfaces;

import com.ibm.qualifiers.HelloQualifier;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@HelloQualifier
public class Hello implements Greeter {
    @Override
    public String sayGreet() {
        return "Hello";
    }
}
