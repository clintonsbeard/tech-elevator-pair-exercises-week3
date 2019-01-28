package com.techelevator;

import java.util.List;

public class BankCustomer {
	
	private String name;
	private String address;
	private String phoneNumber;
	private List<BankAccount> accounts;
	
	//Method to add accounts to a customer's list of accounts
	
	public void addAccount(BankAccount newAccount) {
		accounts.add(newAccount);
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