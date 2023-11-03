package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

import com.sunbeam.SortStudent;
import com.sunbeam.Student;

public class Tester {

	public static void main(String[] args) {
		int choice;
		int size;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of Student - ");
		size = sc.nextInt();
		
		Student student[] = new Student[size];
		
		do {
			System.out.println("1. Enter Student");
			System.out.println("2. Sort Student");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Enter option - ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(index < size) {
					student[index] = new Student();
					student[index].acceptData();
					index++;
				}else {
					System.out.println("Student is full");
				}
				break;
				
			case 2:
				Arrays.sort(student, new SortStudent());
				
				for(Student arr : student) {
//					if(arr != null) {
					System.out.println(arr);
					}
				
				break;

			default:
				break;
			}
			
		}while (choice != 3);
	}

}
