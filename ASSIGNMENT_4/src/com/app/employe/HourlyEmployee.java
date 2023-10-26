package com.app.employe;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	
	double hourlyWage;
	double workingHours;
	
	Scanner sc = new Scanner(System.in);
	
	public HourlyEmployee() {
	}
	
	public HourlyEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter hourly wages - ");
		hourlyWage = sc.nextDouble();
		System.out.print("Enter working hours - ");
		hourlyWage = sc.nextDouble();
	}

	@Override
	public void payrollCalculation() {
		double total;
		if(workingHours <= 40) {
			total = hourlyWage * workingHours;
			System.out.println("Total salary - " + total);
		}
		else if(workingHours > 40) {
			total = ((40*hourlyWage) + (workingHours - 40)*(hourlyWage*1.5));
			System.out.println("Total salary - " + total);
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}