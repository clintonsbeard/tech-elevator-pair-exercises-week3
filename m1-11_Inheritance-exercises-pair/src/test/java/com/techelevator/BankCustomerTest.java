package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class BankCustomerTest {
	
	private BankCustomer bankCustomer;
	private List<BankAccount> bankCustomerAccounts = new ArrayList<>();
	private BankAccount bankCustomerSavings = new SavingsAccount();
	private BankAccount bankCustomerChecking = new CheckingAccount();
	
	//private BigDecimal balance;
	
	@Before
	public void setup() {
		
	}
	
	@After
	public void cleanup() {
		//bankCustomer.withdraw(new BigDecimal("100.00"));
	}

	@Test
	
	public void does_isVIP_method_return_true() {
		
		//Arrange
		bankCustomerAccounts.add(bankCustomerSavings);
		bankCustomerAccounts.add(bankCustomerChecking);
		bankCustomer = new BankCustomer("Joe", "123abc", "123456", bankCustomerAccounts);
		
		//Act
		bankCustomerSavings.deposit(new BigDecimal("10000.00"));
		bankCustomerChecking.deposit(new BigDecimal("30000.00"));

		//Assert
		Assert.assertTrue(bankCustomer.isVIP());
	
	}
	
@Test
	
	public void does_isVIP_method_return_false() {
		
		//Arrange
		bankCustomerAccounts.add(bankCustomerSavings);
		bankCustomerAccounts.add(bankCustomerChecking);
		bankCustomer = new BankCustomer("Joe", "123abc", "123456", bankCustomerAccounts);
		
		//Act
		bankCustomerSavings.deposit(new BigDecimal("10000.00"));
		bankCustomerChecking.deposit(new BigDecimal("3000.00"));

		//Assert
		Assert.assertFalse(bankCustomer.isVIP());
	
	}

}
