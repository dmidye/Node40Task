package com.example.helloworld.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.lang.StringBuilder;

// Jersey resource class
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;

    public HelloWorldResource(String template) {
        this.template = template;
    }

    // returns the greeting defined in hello-world.yml
    @GET
    @Path("/")
    public String sayHello() {
        return this.template;
    }

    // takes in a String path parameter, reverses the string, then returns the reversed string
    // ex.) "reversed" returns "desrever"
    @GET
    @Path("/format/{input}")
    public String format(@PathParam("input") String input) {
          return new StringBuilder(input).reverse().toString();
    }
}
