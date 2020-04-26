package com.wilmir.demorest.resources;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.wilmir.demorest.models.Account;
import com.wilmir.demorest.services.AccountServices;

@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class AccountResources {

	AccountServices accServ = new AccountServices();

	@GET
	public Response getAccounts(@PathParam("customerId") int customerId) {
		Map<Integer, Account> accounts = accServ.getCustomer(customerId);

		return Response.status(Status.OK).entity(accounts).build();    
	}


	
	public Account getAccount(int customerId, int accountNo) {
		
		return accServ.getAccount(accountNo);

	}
}
