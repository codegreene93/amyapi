package com.wilmir.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("calculator") //this is the servlet
public class TemperatureConverter {

	@GET
	@Path("C2F/{param}")
	public Response toFahrenheit(@PathParam("param") double temperature) {
		
		double fahrenheit = (9*temperature/5) + 32;
		
		String message = temperature + " Celsius is equal to " +  fahrenheit + " Fahrenheit.";
		
		return Response.status(200).entity(message).build();
	}
	
	
	@GET
	@Path("F2C/{param}")
	public Response toCelsius(@PathParam("param") double temperature) {
		double celsius = (5.0/9) * (temperature - 32);

		String message = temperature + " Fahrenheit is equal to " +  celsius + " Celsius.";

		return Response.status(200).entity(message).build();
	}

	
}
