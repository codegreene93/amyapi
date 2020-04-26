package com.wilmir.demorest.services;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.wilmir.demorest.database.DatabaseCustomer;
import com.wilmir.demorest.models.Account;
import com.wilmir.demorest.models.Customer;

public class AccountServices {
	
	Customer cust = new Customer();

	private Map <Integer, Account> accounts = DatabaseCustomer.getAccount();
	Map <Integer, Customer> customers = DatabaseCustomer.getCustomer();
	
	public AccountServices() {
		Account acc1 = new Account(1, 001,"Chris", 456, "Debit Acc", 156);
		Account acc2 = new Account(2, 002, "Debbie", 564, "Credit Acc", 234);
		Account acc3 = new Account(3, 003, "Blake", 654, "Savings Acc", 1560);
		
		accounts.put(acc1.getAccountNo(), acc1);
		accounts.put(acc2.getAccountNo(), acc2);
		accounts.put(acc3.getAccountNo(), acc3);
	}
	
	public List<Account> getAccount(){
		return new ArrayList<Account>(accounts.values());
	}
	
	public Map<Integer, Account> getAccounts(){
		return accounts;
	}
	
	public Map<Integer, Account> getCustomer(int customerID) {
		Customer cust =  customers.get(customerID);
	
		return cust.getAccounts();
		
	}
	
	public Account getAccount(int accountNo) {
		Account acc = accounts.get(accountNo);
		
		return acc;
	}
	
	public Account newAccount(Account account) {
		account.setAccountNo(accounts.size() + 1);
		accounts.put(account.getAccountNo(),account);
		return account;
	}

	
	//Add a method to remove an account by customer name
	public Account removeAccount(int customerID) {
		return accounts.remove(customerID);
	}
}

