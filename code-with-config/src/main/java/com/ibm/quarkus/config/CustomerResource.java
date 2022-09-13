package com.ibm.quarkus.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/customer")
public class CustomerResource {

    //    @ConfigProperty(name = "customer.name", defaultValue = "")
//    String name;
    @Inject
    CustomerConfiguration customerConfiguration;

    @GET
    public String getCustomer() {
        //return name;
        return customerConfiguration.name().orElse("Default Name") + customerConfiguration.city().orElse("Default City");
    }
}
