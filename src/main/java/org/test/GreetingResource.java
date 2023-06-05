package org.test;

import java.util.List;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject FruitsService fruitService;

    @GET
    public List<Fruits> list() {
        return fruitService.list();
    }

    @POST
    public List<Fruits> add(Fruits fruit) {
        fruitService.add(fruit);
        return list();
    }


    @Path("/hello2")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return "{Hola:fromchilechuchetumareee2 }";
    }

}
