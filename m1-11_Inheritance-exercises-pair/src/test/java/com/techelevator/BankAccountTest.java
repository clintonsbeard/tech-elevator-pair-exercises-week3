package com.techelevator;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class BankAccountTest {
	
	private BankAccount bankAccount;
	private BankAccount destinationAccount;
	
	//private BigDecimal balance;
	
	@Before
	public void setup() {
		bankAccount = new BankAccount();
		destinationAccount = new BankAccount();
	}
	
	@After
	public void cleanup() {
		//bankAccount.withdraw(new BigDecimal("100.00"));
	}
	
	@Test
	
	public void can_account_number_be_set_and_retrieved() {
		
		//Act
		bankAccount.setAccountNumber("1234567890");
		
		//Arrange
	
		Assert.assertEquals("1234567890", bankAccount.getAccountNumber());
	
	}
	
	@Test
	
	public void does_bankaccount_start_at_0() {
		
		//Assert
		Assert.assertEquals(new BigDecimal("0"), bankAccount.getBalance());
	
	}

	@Test
	
	public void does_deposit_method_work() {
		
		//Arrange
		
		//Act
		bankAccount.deposit(new BigDecimal("100.00"));
		//Assert
		Assert.assertEquals(new BigDecimal("100.00"), bankAccount.getBalance());
	
	}
	
	@Test
	
	public void does_withdraw_method_work() {
		
		//Arrange
		bankAccount.deposit(new BigDecimal("120.00"));
		
		//Act
		bankAccount.withdraw(new BigDecimal("20.00"));

		//Assert
		Assert.assertEquals(new BigDecimal("100.00"), bankAccount.getBalance());
	
	}
	
@Test
	
	public void does_transfer_method_work() {
		
		//Arrange
		bankAccount.deposit(new BigDecimal("100.00"));
		
		//Act
		bankAccount.transfer(destinationAccount, new BigDecimal("100.00"));

		//Assert
		Assert.assertEquals(new BigDecimal("100.00"), destinationAccount.getBalance());
	
	}

}
