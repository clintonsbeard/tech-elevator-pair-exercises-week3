package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankTeller {

	public static void main(String[] args) {
		
		/* Creating Checking and Savings Account (classes) for Sally. */
			
			BankAccount sallysSavings = new SavingsAccount();
			BankAccount sallysChecking = new CheckingAccount();

		
		/* Creating Bank accounts for Sally*/
		
			List<BankAccount> sallysAccounts = new ArrayList<>();
		
		/* Adding newly created Checking and Savings Accounts to their list of Bank accounts */

			
			sallysAccounts.add(sallysSavings);
			sallysAccounts.add(sallysChecking);
			
			
		/* Create the Bank customers and adding them to List Of Customers 
		 * (with "name", "address", "phone number" and <list of accounts>. 
		 */
			
			BankCustomer sallyHensen = new BankCustomer("Sally Hensen", "456 Street Road", "555-555-5556", sallysAccounts);

		/* Create list of Bank customers. */
		
			List<BankCustomer> listOfCustomers = new ArrayList<>();
		
		/* Adding Joe, Sally and Neil to listOfCustomers*/
			
			listOfCustomers.add(sallyHensen);

		/* Deposit money in Joe, Sally and Neil's accounts. */
			

			sallysChecking.deposit(new BigDecimal("100.00"));
			sallysSavings.deposit(new BigDecimal("120.00"));

		
			
		/* withdraw and transfer method verification*/
			
			
			

			System.out.println("Sallys Checking Account Balance now is: " + sallysChecking.getBalance());
			System.out.println("Sallys Savings Account Balance now is: " + sallysSavings.getBalance());
			System.out.println("Is Sally Hensen a VIP? " + sallyHensen.isVIP());
			
			/* tranferring money by withdraw and deposit */
			
//			BigDecimal amountToTransfer = new BigDecimal("5200.00");
			sallysChecking.withdraw(new BigDecimal("120.00"));
			System.out.println(sallysChecking.getBalance());
//			sallysChecking.deposit(amountToTransfer);
//			
			
			sallysSavings.transfer(sallysChecking, new BigDecimal("5200.00"));
			System.out.println("Sallys Checking Account Balance (after trasnfer of 5200.00) now is: " + sallysChecking.getBalance());
			System.out.println("Sallys Savings Account Balance (after trasnfer of 5200.00) now is: " + sallysSavings.getBalance());


		
		/*Printing Whether a customer is VIP?*/
			
			System.out.println("(after transfer) Is Sally Hensen a VIP? " + sallyHensen.isVIP());
			
		}

}