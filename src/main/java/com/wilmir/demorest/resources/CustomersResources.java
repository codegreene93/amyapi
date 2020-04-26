package com.wilmir.demorest.resources;



import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.wilmir.demorest.models.Customer;
import com.wilmir.demorest.services.CustomerServices;


@Path("/customers")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class CustomersResources {
	
	CustomerServices customerServices = new CustomerServices();
	
	
	@GET 
	
	public Response getLogin(@QueryParam("email")String email, @QueryParam("password")String password)
			 {
		
		if(email != null && password != null) {
			Customer customers =  customerServices.getLogin(email, password);
		

			return Response.status(Status.OK).entity(customers).build();	
		
		}else {
			Map <Integer, Customer> customers = customerServices.getCustomers1();
			
			return Response.status(Status.OK).entity(customers).build();	
		}
		
	}
	
	@GET 
	@Path("/{customerId}")
	
	public Response getCustomer(@PathParam("customerId") int customerID) {
		Customer customer = customerServices.getCustomer(customerID);
		
		return Response.status(Status.OK).entity(customer).build();	
	}
	
	@POST
	public Response createCustomer(Customer cust ) {
		Customer customer = customerServices.createCustomer(cust);
		
		return Response.status(Status.OK).entity(customer).build();	
	}
	
	@DELETE
	@Path("/{customerId}")
	public Response deleteCustomer(@PathParam("customerId") int customerID)
	{
		Customer customer = customerServices.deleteCustomer(customerID);
		return Response.status(Status.OK).entity(customer).build();	
	}

}
