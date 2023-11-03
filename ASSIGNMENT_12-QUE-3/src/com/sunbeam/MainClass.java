package com.sunbeam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import com.sunbeam.Employee;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<Employee> e = new LinkedList<Employee>();
		int choice = 0;

		do {

			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Find Employee");
			System.out.println("4. Sort Employee");
			System.out.println("5. Edit Employee");
			System.out.println();
			System.out.print("Enter option - ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Employee e1 = new Employee();
				e1.acceptData();
				e.add(e1);
				break;

			case 2:
				System.out.print("Enter Employee id - ");
				int id1 = sc.nextInt();
				Employee e2 = new Employee(id1);
				if (e.contains(e2)) {
					int index = e.indexOf(e2);
					e.remove(index);
					System.out.println("Employee deleted");
				}
				break;

			case 3:
				System.out.print("Enter Employee Id - ");
				int in = sc.nextInt();
				Employee e3 = new Employee(in);
				if (e.contains(e3)) {
					int index = e.indexOf(e3);
					System.out.println(e.get(index).toString());
				}

				break;

			case 4:

				Collections.sort(e);
				System.out.println("After Sorting by id");
				System.out.println(e.toString());
				break;

			case 5:
				System.out.print("Enter Employee id - ");
				int id2 = sc.nextInt();
				Employee e4 = new Employee(id2);
				if (e.contains(e4)) {
					int index = e.indexOf(e4);
					Employee e5 = e.get(index);
					System.out.println("What do you want to update");
					System.out.println("1. Employee Name");
					System.out.println("2. Employee Salary");
					System.out.println();
					System.out.print("Enter option - ");
					int up = sc.nextInt();

					switch (up) {
					case 1:
						System.out.print("Enter Updated Name - ");
						e5.setName(sc.next());
						break;

					case 2:
						System.out.print("Enter Updated Salaray - ");
						e5.setSalary(sc.nextDouble());
						break;
					}
				} else {
					System.out.println("Employee not found");
				}
				break;
			}

		} while (choice != 0);
	}
}
