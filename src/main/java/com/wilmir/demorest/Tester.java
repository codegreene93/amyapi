package com.wilmir.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class Tester {
	@GET
	@Path("/{param}")
	public Response sayHelloWorld(@PathParam("param") String message) {
		
		String output = "Hello " + message +"!";
		
		return Response.status(200).entity(output).build();
	
		
	}
}
