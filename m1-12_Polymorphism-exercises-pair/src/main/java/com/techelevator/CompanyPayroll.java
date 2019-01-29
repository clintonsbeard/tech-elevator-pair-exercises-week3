package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class CompanyPayroll {
	
	public static void main(String[] args) {
		
		HourlyWorker mickey = new HourlyWorker ("Mickey", "Mouse", 15.00);
		SalaryWorker goofy = new SalaryWorker ("George (Goofy)", "Geef", 50000);
		VolunteerWorker daisy = new VolunteerWorker ("Daisy", "Duck");
		HourlyWorker minnie = new HourlyWorker ("Minnie", "Mouse", 15.00);
		
		List<Worker> disneyEmployees = new ArrayList<>();
		disneyEmployees.add(mickey);
		disneyEmployees.add(goofy);
		disneyEmployees.add(daisy);
		disneyEmployees.add(minnie);
		
		int mickeysHoursWorked = (int)(mickey.getHourlyRate()) * (int) (Math.random() * 50);
		int goofysHoursWorked = (int) (Math.random() * 50);
		int daisysHoursWorked = (int) (Math.random() * 50);
		int minniesHoursWorked = (int)(minnie.getHourlyRate()) * (int) (Math.random() * 50);
		
		double mickeysWeeklyPay = mickey.calculateWeeklyPay(mickeysHoursWorked);
		double goofysWeeklyPay = goofy.calculateWeeklyPay(goofysHoursWorked);
		double daisysWeeklyPay = daisy.calculateWeeklyPay(daisysHoursWorked);
		double minniesWeeklyPay = minnie.calculateWeeklyPay(minniesHoursWorked);
		
		System.out.printf("$%2.2f", mickeysWeeklyPay);
		System.out.println();
		System.out.printf("$%2.2f", goofysWeeklyPay);
		System.out.println();
		System.out.printf("$%2.2f", daisysWeeklyPay);
		System.out.println();
		System.out.printf("$%2.2f", minniesWeeklyPay);
		
		double totalWeeklyPay = mickeysWeeklyPay + goofysWeeklyPay + daisysWeeklyPay + minniesWeeklyPay;
		
		System.out.println();
		System.out.println("====================================================");
		System.out.printf("Total Weekly Pay: $%2.2f", totalWeeklyPay);
		
		double totalHoursWorked = mickeysHoursWorked + goofysHoursWorked + daisysHoursWorked + minniesHoursWorked;
		
		System.out.println();
		System.out.println("====================================================");
		System.out.printf("Total Hours Worked: %2.2f", totalHoursWorked);
	}
}