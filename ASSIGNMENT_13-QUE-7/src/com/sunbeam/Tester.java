package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.sunbeam.Student;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Map<Integer, Student> students = new LinkedHashMap<>();
		
		while ((choice = menuChoice(sc)) != 0) {
			switch (choice) {
			case 1:
				Student s = new Student();
				s.accept();
				students.put(s.getRoll(), s);
				break;
				
			case 2:
				System.out.print("Enter the roll no: ");
				int roll = sc.nextInt();
				if (students.containsKey(roll))
					System.out.println(students.get(roll));
				else
					System.out.println("Student not found!");
				break;
				
			default:
				System.out.println("Kindly select a valid choice!");
				break;
			}
		}
	}
	// Q) Do we need to write equals() and hashCode() in Student class?
	// Ans: No, we do not need to write the equals() and hashCode() methods
	
	public static int menuChoice(Scanner sc) {
		int choice;
		
		System.out.println("--------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Find Student");
		System.out.println("--------------------------");
		System.out.print("Select your choice: ");
		choice = sc.nextInt();
		System.out.println("--------------------------");
		
		return choice;
	}
}
