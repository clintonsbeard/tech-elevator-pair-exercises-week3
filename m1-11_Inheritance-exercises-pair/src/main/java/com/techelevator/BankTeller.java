package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankTeller {

	public static void main(String[] args) {
		
//		List<BankAccount> joesAccountList = new ArrayList<BankAccount>();
		
		BankCustomer joeJohn = new BankCustomer();
		
		CheckingAccount checking = new CheckingAccount();
		SavingsAccount savings = new SavingsAccount();
		
		joeJohn.addAccount(checking);
		joeJohn.addAccount(savings);
		
		System.out.println(String.format("Joe John has %s accounts.", joeJohn.getAccounts().size()));
		
		checking.deposit(new BigDecimal(100.00));
		savings.deposit(new BigDecimal(50.00));
		
		System.out.println(checking.getBalance());
		System.out.println(savings.getBalance());
		
		checking.withdraw(new BigDecimal(400.00));
		savings.withdraw(new BigDecimal(48.00));
		
		System.out.println(checking.getBalance());
		System.out.println(savings.getBalance());
	}

}