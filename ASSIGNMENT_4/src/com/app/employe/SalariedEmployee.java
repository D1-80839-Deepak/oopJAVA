package com.app.employe;

import java.util.Scanner;

public class SalariedEmployee extends Employee{

	double weeklySalary;
	
	Scanner sc = new Scanner(System.in);
	
	public SalariedEmployee() {
	}
	
	public SalariedEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
	}
	
	@Override
	public void payrollCalculation() {
		System.out.println("Weekly salrary - " + weeklySalary);
		
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter Weekly salary - ");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
}