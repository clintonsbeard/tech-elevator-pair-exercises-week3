package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer extends BankAccount {
	
	private String name;
	private String address;
	private String phoneNumber;
	private List<BankAccount> accounts;
	
	//constructor
	
		public BankCustomer(String name, String address, String phoneNumber, List<BankAccount> accounts) {
			this.accounts = accounts;
			this.name = name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			
		}

	/* Methods */
		
	/*Adds newAccount to the customer's list of accounts.*/
		/* with the constructor above we will now be using this method*/
	
	public void addAccount(BankAccount newAccount) {
		accounts.add(newAccount);
	}
	
	/*Determining if a customer is a VIP works as expected*/
	
	public boolean isVIP() {
		BigDecimal sumOfAccounts = new BigDecimal(0.00);
		BigDecimal vipAmount = new BigDecimal(25000.00);
		for (BankAccount thisAccount : accounts) {
			sumOfAccounts = sumOfAccounts.add(thisAccount.getBalance());
		}
		if (sumOfAccounts.compareTo(vipAmount) == 1) {
			return true;
		}
		return false;
	}
	
	
	
	//GETTER and SETTER
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<BankAccount> getAccounts() {
		return accounts;
	}

}