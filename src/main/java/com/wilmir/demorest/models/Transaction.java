package com.wilmir.demorest.models;



import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Transaction {
	private int transactionCode;
	private int accountNo;
	private int customerID;
	private double date;
	private String description;
	private String transactionType;
	private int withdraw;
	private int oldBalance;
	private int newBalance;
	
	public Transaction() {
		
	}
	
	public Transaction(int transactionCode, int oldBalance, int accountNo, int customerID, double date, String description, String transactionType, int newBalance) {
		this.transactionCode=transactionCode;
		this.oldBalance=oldBalance;
		this.accountNo=accountNo;
		this.customerID = customerID;
		this.date = date;
		this.description = description;
		this.transactionType=transactionType;
		this.newBalance= newBalance;
	}
	
	public int getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(int newBalance) {
		this.newBalance = newBalance;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getOldBalance() {
		return oldBalance;
	}

	public void setOldBalance(int oldBalance) {
		this.oldBalance = oldBalance;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
}
