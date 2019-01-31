package com.techelevator;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class CheckingAccountTest {
	
	private CheckingAccount checkingAccount;
	//private BigDecimal balance;
	
	@Before
	public void setup() {
		checkingAccount = new CheckingAccount();
	}
	
	@After
	public void cleanup() {
		
	}
	
	
	@Test
	
	public void is_overdraft_method_working() {
		
		//Arrange
		checkingAccount.deposit(new BigDecimal("100.00"));
		
		//Act
		checkingAccount.withdraw(new BigDecimal("120.00"));

		//Assert
		Assert.assertEquals(new BigDecimal("-30.00"), checkingAccount.getBalance());
	
	}
	
	@Test
	
	public void does_overdraft_stop_work() {
		
		//Arrange
		checkingAccount.deposit(new BigDecimal("100.00"));
		
		//Act
		checkingAccount.withdraw(new BigDecimal("220.00"));

		//Assert
		Assert.assertEquals(new BigDecimal("100.00"), checkingAccount.getBalance());
	
	}

}
