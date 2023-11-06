package com.sunbeam.tester;

import com.sunbeam.office.*;
import com.sunbeam.helper.*;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee[] arr = new Employee[] {
				new Manager(1000.50, 200.50),
				new Labour(350, 200),
				new Clerk(1000.75),
				new Labour(300, 100)
		};
		
		// Displaying employees
		for (Employee emp:arr)
			System.out.println(emp.toString());
		
		System.out.println("-------------------------------");
		System.out.print("Sum of Income of all employees = " + Employee.calcTotalIncome(arr));		
	}

}
