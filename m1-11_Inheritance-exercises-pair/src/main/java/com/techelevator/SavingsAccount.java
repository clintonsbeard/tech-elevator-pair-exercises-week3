package com.techelevator;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {
	
	BigDecimal overdraftFee = new BigDecimal(2.00); 
	BigDecimal hundredFifty = new BigDecimal(148.01);
		
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
			
		if (getBalance().compareTo(amountToWithdraw) < 0) {
			return getBalance();
		}
		if (getBalance().compareTo(hundredFifty) < 0) {
			return super.withdraw(amountToWithdraw.add(overdraftFee));
		}
		return super.withdraw(amountToWithdraw);
	}

}