package com.app.employe;

import java.util.Scanner;

public class CommEmployee extends Employee {

	double grossSale;
	double commRate;

	Scanner sc = new Scanner(System.in);

	public CommEmployee() {
	}

	public CommEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter gross sale - ");
		grossSale = sc.nextDouble();
		System.out.print("Enter commision rate - ");
		commRate = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + " CommEmployee [grossSale=" + grossSale + ", commRate=" + commRate + "]";
	}

	@Override
	public void payrollCalculation() {
		System.out.println("Total salary - " + commRate*grossSale);
	}

}
