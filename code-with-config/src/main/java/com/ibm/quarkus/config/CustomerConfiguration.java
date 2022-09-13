package com.ibm.quarkus.config;


import io.quarkus.arc.config.ConfigProperties;
import io.smallrye.config.ConfigMapping;

import java.util.Optional;
//import io.smallrye.config.ConfigMapping;


@ConfigProperties(prefix = "customer")
//@ConfigMapping(prefix = "customer")
public interface CustomerConfiguration {
    //the property name is method name
//    String name();
//    String city();
//    String state();
//    String zipcode();
    Optional<String> name();
    Optional<String> city();
    Optional<String> state();
    Optional<String> zipcode();
}