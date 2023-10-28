package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.Product;
import com.sunbeam.Books;

public class Test {

	public static void main(String[] args) {
//		Product[] arr = new Product[5];
		System.out.println("select Product");
		System.out.println("0. Exit");
		System.out.println("1. Books");
		System.out.println("2. Albums");
		System.out.println("3. Toys");
		System.out.println("4. Generate Bill");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Books b = new Books();

		while (choice != 0) {
			int index = 0;
			switch (choice) {
			case 1:
				if (index >= 5)
					System.out.println("full");
				else
					b.accept();
				index++;
				break;
			case 2:

				break;
			case 3:

				break;

			default:
				break;
			}
		}

	}

}
