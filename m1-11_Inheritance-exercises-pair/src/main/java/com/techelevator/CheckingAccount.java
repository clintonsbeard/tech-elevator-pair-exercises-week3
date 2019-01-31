package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
	
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		
		BigDecimal overdraftCheck = getBalance().subtract(amountToWithdraw);
		
		if (overdraftCheck.compareTo(new BigDecimal(-100.00)) < 0) {
			return getBalance();
		}
		else if (getBalance().compareTo(amountToWithdraw) < 0) {
			return super.withdraw(amountToWithdraw.add(new BigDecimal(10.00)));
		}
		return super.withdraw(amountToWithdraw);
	}

}