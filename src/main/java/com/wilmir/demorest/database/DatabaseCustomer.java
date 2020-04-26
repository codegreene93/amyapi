package com.wilmir.demorest.database;

import java.util.Map;
import java.util.TreeMap;

import com.wilmir.demorest.models.Account;
import com.wilmir.demorest.models.Customer;
import com.wilmir.demorest.models.Transaction;


public class DatabaseCustomer {

	private static Map <Integer, Customer> customers = new TreeMap<Integer, Customer>();
	private static Map <Integer, Account> accounts = new TreeMap<Integer, Account>();
	private static Map <String, Transaction> transactions = new TreeMap<String, Transaction>();
	
	public static Map <Integer, Customer> getCustomer(){
		
		return customers;
		
	} 
	
	public static Map <Integer, Account> getAccount(){
		
		return accounts;
	} 
	
	public static  Map <String, Transaction> getTransaction(){
		
		return transactions;
		
	}
}
