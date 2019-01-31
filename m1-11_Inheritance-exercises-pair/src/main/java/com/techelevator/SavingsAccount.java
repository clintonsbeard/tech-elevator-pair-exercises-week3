package com.techelevator;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {
		
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
			
		if (getBalance().compareTo(amountToWithdraw) < 0) {
			return getBalance();
		}else if (getBalance().compareTo(new BigDecimal(150.00)) == (-1)) {
			return super.withdraw(amountToWithdraw.add(new BigDecimal(2.00)));
		}
		return super.withdraw(amountToWithdraw);
	}

}