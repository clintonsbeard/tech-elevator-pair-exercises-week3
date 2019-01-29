package com.techelevator;

public class HourlyWorker implements Worker {
	
	/* Data Members */
	
	private double hourlyRate;
	
	/* Constructor */
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	/* Getters and Setters */ 

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		double pay = hourlyRate * hoursWorked;
		if (hoursWorked > 40) {
			double overtime = hoursWorked - 40;
			return pay + ((hourlyRate * 1.5) * overtime);
		}
		if (hoursWorked > 0) {
			return pay;
		}
		return 0.00;
	}
	
}