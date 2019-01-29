package com.techelevator;

public class SalaryWorker implements Worker {

	/* Data Members */
	
	private double annualSalary;

	/* Constructor */
	
	public SalaryWorker(String firstName, String lastName, double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	/* Getters and Setters */ 
	
	public double getAnnualSalary() {
		return annualSalary;
	}

	@Override
	public String getFirstName() {
		return null;
	}

	@Override
	public String getLastName() {
		return null;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		return annualSalary / 52;
	}
	
}