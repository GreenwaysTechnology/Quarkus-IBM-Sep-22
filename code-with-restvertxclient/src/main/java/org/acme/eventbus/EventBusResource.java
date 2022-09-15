package org.acme.eventbus;

import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/eventbus")
public class EventBusResource {
    @Inject
    EventBus eventBus;

    //publish message
    @GET
    @Path("{name}")
    public String greetMe(@PathParam(value = "name") String name) {
        //publish message - fire and forgot - eventbus.send -  point to point
        JsonObject jsonObject = new JsonObject().put("name", name);
        //publish message
        eventBus.send("ibm.greet", jsonObject);
        return "Processed";
    }
}

