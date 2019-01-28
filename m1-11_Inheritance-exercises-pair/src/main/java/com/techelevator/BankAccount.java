package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {

	/* Data Members */
	private String accountNumber;
	private BigDecimal balance;
	
	/* Getters and Setters */
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	
	/* Constructor */
	public BankAccount() {
		balance = new BigDecimal(0.00);
	}
	
	/* Methods */
	public BigDecimal deposit(BigDecimal amountToDeposit) {
		return balance = getBalance().add(amountToDeposit);
	}
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		return balance = getBalance().subtract(amountToWithdraw);
	}
	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		this.balance.subtract(transferAmount);
		destinationAccount.balance.add(transferAmount);
	}
	
}