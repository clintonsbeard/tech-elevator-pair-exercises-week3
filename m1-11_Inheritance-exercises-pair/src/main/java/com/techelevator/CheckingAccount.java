package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
	
	BigDecimal overdraftFee = new BigDecimal(10.00);
	BigDecimal overdraftStop = new BigDecimal(-100.00);
	
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		BigDecimal overdraftCheck = getBalance().subtract(amountToWithdraw);
		if (overdraftCheck.compareTo(overdraftStop) < 0) {
			return getBalance();
		}
		else if (getBalance().compareTo(amountToWithdraw) < 0) {
			return super.withdraw(amountToWithdraw.add(overdraftFee));
		}
		return super.withdraw(amountToWithdraw);
	}

}