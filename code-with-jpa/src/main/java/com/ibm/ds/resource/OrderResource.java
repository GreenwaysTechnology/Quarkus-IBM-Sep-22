package com.ibm.ds.resource;


import com.ibm.ds.model.Order;
import com.ibm.ds.service.OrderRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/orders")
public class OrderResource {

    @Inject
    OrderRepository orderRepository;

    @GET
    public List<Order> findAll() {
        return orderRepository.findAll().list();
    }

    @POST
    @Transactional
    public Response createOrder(Order order) {
        orderRepository.persist(order);
        //orderRepository.persist(new Order(1992323.78, "Building materials"));
        return Response.ok().entity(orderRepository.listAll()).build();
    }
}
