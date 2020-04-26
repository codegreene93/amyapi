package com.wilmir.demorest.models;


import java.util.Map;
import java.util.TreeMap;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private int customerID;
	private String name;
	private String address;
	private String email;
	private String password;

	
	private Map<Integer,Account> accounts = new TreeMap<Integer,Account>();
	
	public Customer() {
		
	}
	
	public Customer(int customerID, String name, String address, String email, String password, String reenterPassword, int accountNo) {
		this.customerID= customerID;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password=password;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}

	public Customer getLogin(String email, String password) {
	
		return null;
	}

	
}