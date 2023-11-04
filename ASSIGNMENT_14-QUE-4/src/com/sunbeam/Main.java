package com.sunbeam;

import java.util.Scanner;

public class Main {
	static void calculate(double num1, double num2, Arithmatic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("Enter choice");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter two numbers to add");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				calculate(a, b, (num1, num2) -> num1 + num2);
				break;
			case 2:
				System.out.println("enter two numbers to subtract");
				double a1 = sc.nextDouble();
				double b1= sc.nextDouble();

				calculate(a1, b1, (num1, num2) -> num1 - num2);

				break;
			case 3:
				System.out.println("enter two numbers to multiply");
				double a2 = sc.nextDouble();
				double b2 = sc.nextDouble();

				calculate(a2, b2, (num1, num2) -> num1 * num2);

				break;
			case 4:
				System.out.println("enter two numbers to divide");
				double a3 = sc.nextDouble();
				double b3 = sc.nextDouble();

				calculate(a3, b3, (num1, num2) -> num1 / num2);
				break;

			default:
				break;
			}

		} while (choice != 0);
		calculate(0, 0, null);

	}

}
