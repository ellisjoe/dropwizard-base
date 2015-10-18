package com.joe.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class HelloResource {

    @GET
    @Path("/hello")
    public StringResponse sayHello() {
        return new StringResponse("Hello world");
    }

}