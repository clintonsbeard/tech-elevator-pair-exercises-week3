package com.techelevator;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class SavingsAccountTest {
	
	private SavingsAccount savingsAccount;
	//private BigDecimal balance;
	
	@Before
	public void setup() {
		savingsAccount = new SavingsAccount();
	}
	
	@After
	public void cleanup() {
		
	}
	
	
	@Test
	
	public void is_overdraft_method_working() {
		
		//Arrange
		savingsAccount.deposit(new BigDecimal("140.00"));
		
		//Act
		savingsAccount.withdraw(new BigDecimal("38.00"));

		//Assert
		Assert.assertEquals(new BigDecimal("100.00"), savingsAccount.getBalance());
	
	}
	
	@Test
	
	public void does_overdraft_stop_work() {
		
		//Arrange
		savingsAccount.deposit(new BigDecimal("140.00"));
		
		//Act
		savingsAccount.withdraw(new BigDecimal("141.00"));

		//Assert
		Assert.assertEquals(new BigDecimal("140.00"), savingsAccount.getBalance());
	
	}

}