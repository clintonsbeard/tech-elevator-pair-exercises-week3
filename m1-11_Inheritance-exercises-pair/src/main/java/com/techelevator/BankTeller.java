package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankTeller {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		/* Create list of customer accounts for each customer. */
		
		List<BankAccount> listOfJoeJohnsonAccounts = new ArrayList<>();
			
			
			/* Give them a checking and a savings account. */ 
		
			BankAccount joeJohnsonSavings = new SavingsAccount();
			BankAccount joeJohnsonChecking = new CheckingAccount();
			
			listOfJoeJohnsonAccounts.add(joeJohnsonChecking);
			listOfJoeJohnsonAccounts.add(joeJohnsonSavings);
			
			/* Add the checking and savings account to the list of customer's accounts. */
			
			BigDecimal joeJohnsonCheckingDeposit = new BigDecimal("21000.00");
			BigDecimal joeJohnsonSavingsDeposit = new BigDecimal("14999.99");
			
			joeJohnsonChecking.deposit(joeJohnsonCheckingDeposit);
			joeJohnsonSavings.deposit(joeJohnsonSavingsDeposit);
			
			
			
			/* Create the customer and attach their list of accounts to them. */
		
			BankCustomer joeJohnson = new BankCustomer("Joe Johnson", "123 Street Road", "555-555-5555", listOfJoeJohnsonAccounts);
			
			/* Deposit money in their accounts. */
			
			
			
			
			
		
		List<BankAccount> listOfSallySmithAccounts = new ArrayList<>();
		
			SavingsAccount sallySmithSavings = new SavingsAccount();
			CheckingAccount sallySmithChecking = new CheckingAccount();
		
			listOfSallySmithAccounts.add(sallySmithChecking);
			listOfSallySmithAccounts.add(sallySmithSavings);
		
			new BankCustomer("Sally Smith", "123 Street Road", "555-555-5555", listOfSallySmithAccounts);
		
			BigDecimal sallySmithCheckingDeposit = new BigDecimal(25000.00);
			BigDecimal sallySmithSavingsDeposit = new BigDecimal(25000.00);
			
			sallySmithChecking.deposit(sallySmithCheckingDeposit);
			sallySmithSavings.deposit(sallySmithCheckingDeposit);
			
		List<BankAccount> listOfNeilDiamondAccounts = new ArrayList<>();
		
			CheckingAccount neilDiamondChecking = new CheckingAccount();
		
			listOfNeilDiamondAccounts.add(neilDiamondChecking);
		
			new BankCustomer("Neil Diamond", "1000 Diamond Road", "555-555-5555", listOfNeilDiamondAccounts);
			
			
			/* withdraw method verification*/
			
			
		
			
			System.out.println(joeJohnson.isVIP());
			}

}