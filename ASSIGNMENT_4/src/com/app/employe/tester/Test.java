package com.app.employe.tester;

import java.util.Scanner;

import com.app.employe.BaseCommEmployee;
import com.app.employe.CommEmployee;
import com.app.employe.Employee;
import com.app.employe.HourlyEmployee;
import com.app.employe.SalariedEmployee;

public class Test {

	public static void main(String[] args) {
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.println("==================================================");
			System.out.println("1. Salaried Employee");
			System.out.println("2. Hourly paid Employee");
			System.out.println("3. Employee salary paid on pecentage of sales");
			System.out.println("4. Base salary and commission Employee");
			System.out.println("0. Exit");
			System.out.println();
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println();
				System.out.println("==================================================");
				Employee employee1 = new SalariedEmployee();
				employee1.acceptData();
				employee1.toString();
				employee1.payrollCalculation();
				break;
			case 2:
				System.out.println();
				System.out.println("==================================================");
				Employee employee2 = new HourlyEmployee();
				employee2.acceptData();
				employee2.toString();
				employee2.payrollCalculation();
				break;
			case 3:
				System.out.println();
				System.out.println("==================================================");
				Employee employee3 = new CommEmployee();
				employee3.acceptData();
				employee3.toString();
				employee3.payrollCalculation();
				break;
			case 4:
				System.out.println();
				System.out.println("==================================================");
				Employee employee4 = new BaseCommEmployee();
				employee4.acceptData();
				employee4.toString();
				employee4.payrollCalculation();
				BaseCommEmployee baseCommEmployee = (BaseCommEmployee)employee4;
				baseCommEmployee.printSalary();
				break;

			default:
				break;
			}
			
		}while(choice != 0);
		
	}

}