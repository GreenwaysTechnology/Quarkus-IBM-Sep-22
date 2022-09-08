package com.ibm.service.interfaces;

import com.ibm.qualifiers.HaiQualifier;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@HaiQualifier
public class Hai implements Greeter {
    @Override
    public String sayGreet() {
        return "Hai";
    }
}
