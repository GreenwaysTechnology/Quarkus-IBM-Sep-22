package com.ibm.ds.resource;

import com.ibm.ds.model.Customer;
import com.ibm.ds.service.CustomerService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customers")
public class CustomerResource {

    @Inject
    CustomerService customerService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> list() {
        return customerService.listCustomers();
    }
}
