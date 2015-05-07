package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/test")
public class TestRestService {
    
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Response FirstRestFunction() {
       StringBuilder testData = new StringBuilder();
       testData.append("Prasad");
        // return HTTP response 200 in case of success
        return Response.ok(testData.toString()).build();
    }
}