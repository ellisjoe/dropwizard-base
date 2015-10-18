package org.base;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/api")
public class BaseResource {

    @GET
    @Path("/test")
    public StringResponse test() {
        return new StringResponse("Sucess");
    }

}