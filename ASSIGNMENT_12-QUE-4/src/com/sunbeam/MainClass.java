package com.sunbeam;

import java.util.PriorityQueue;
import java.util.Scanner;

import com.sunbeam.SortEmployeeBySalaryDesc;
import com.sunbeam.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<Employee> e = new PriorityQueue<Employee>(new SortEmployeeBySalaryDesc());
		
		System.out.print("Enter number of Employees - ");
		int index = new Scanner(System.in).nextInt();
		for(int i = 0; i < index; i++) {
			Employee e1 = new Employee();
			e1.acceptData();
			e.offer(e1);
			System.out.println();
			System.out.println("------------------------");
			System.out.println();
		}
		
		System.out.println("-----Deleting Employee in Desending order of Salary-----");
		
		for(int i = 0; i < index; i++) {
			System.out.println(e.poll());
		}
	}

}
