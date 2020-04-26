package com.wilmir.demorest.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;
import java.util.TreeMap;

@XmlRootElement
public class Account {

	private int accountNo;
	private int customerID;
	private String customerName;
	private int sortNo;
	private String accountType;
	private int balance;
	private Map<Integer, Transaction> transactions = new TreeMap<Integer, Transaction>();
	
	public Account() {
		
	}
	
	public Account(int accountNo, int customerID,String customerName,int sortNo, String accountType, int balance) {
		this.accountNo = accountNo;
		this.customerID= customerID;
		this.sortNo = sortNo;
		this.accountType = accountType;
		this.balance = balance;
		this.customerName = customerName;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getSortNo() {
		return sortNo;
	}
	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Map<Integer, Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(TreeMap<Integer, Transaction> transactions) {
		this.transactions = transactions;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
