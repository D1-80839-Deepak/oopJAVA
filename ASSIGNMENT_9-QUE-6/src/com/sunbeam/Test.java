package com.sunbeam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Person[] arr = new Person[5];
		Scanner sc = new Scanner(System.in);
		int choice;
		int index = 0;
		do {

			System.out.println("0. Exit");
			System.out.println("1. Add New Person");
			System.out.println("2. Display All Person");
			System.out.println("3. Find a Person By Name");
			System.out.println("enter choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				arr[index] = new Person();
				arr[index].acceptData();
				index++;
				break;
			case 2:

				for (int i = 0; i < index; i++)
					arr[i].displayData();
				break;
			case 3:
				String name;
				System.out.println("enter name");
				name = sc.next();
				for (int i = 0; i < index; i++) {
					if (arr[i].getName().equalsIgnoreCase(name))
						arr[i].displayData();
				}

				break;

			default:
				break;
			}
		} while (choice != 0);

	}

}
