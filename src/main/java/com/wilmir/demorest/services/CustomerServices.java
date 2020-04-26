package com.wilmir.demorest.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wilmir.demorest.database.DatabaseCustomer;
import com.wilmir.demorest.models.Customer;



public class CustomerServices {

	Map <Integer, Customer> customers = DatabaseCustomer.getCustomer();
	
	
	public CustomerServices() {
	customers.put(1, new Customer(1, "Reggie", "Eyre Square, Galway,", "test@test.com", "FunkyMonk3y!","FunkyMonk3y!", 25));
	customers.put(2, new Customer(2,"Julian", "Drumcondra, Dublin", "Julian@test.com", "hAppyda$h","hAppyda$h", 26 ));
	customers.put(3, new Customer(3,"Rachel", "Kevin Street Lower, Dublin", "Rachel@test.com", "Password1", "Password1", 27));

	
	}
	
	public Map <Integer, Customer> getCustomers1(){
		
		return customers;
	}
	
	public List<Customer> getCustomers(){
		return new ArrayList<Customer>(customers.values());
	}
	
	public Customer getCustomer(int customerID) {
		Customer cust =  customers.get(customerID);
		
		return cust;
	}
	
	public Customer deleteCustomer(int customerID) {
		Customer customer = getCustomer(customerID);
		customers.remove(customerID);
		return customer;
	}
	
	public Customer createCustomer(Customer customer) {
		customer.setCustomerID(customers.size() + 1);
		customers.put(customer.getCustomerID(),customer);
		return customer;
	}
	
	public Customer getLogin(String email, String password) {
		
		
		for(Customer customer :customers.values()) {
			String customerEmail =  customer.getEmail();
			String customerPassword = customer.getPassword();
			
			if(customerEmail.equalsIgnoreCase(email) && customerPassword.equals(password)){
				return customer;
			
			}
			
		}
	
		return null;
	}
}