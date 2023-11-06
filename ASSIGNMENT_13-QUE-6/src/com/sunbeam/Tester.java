package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sunbeam.Book;

public class Tester {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Map<String, Book> arr = new HashMap<>();
		
		while ((choice = menuChoice(sc)) != 0) {
			switch (choice) {
			case 1:
				Book book = new Book();
				book.accept(sc);
				arr.put(book.getIsbn(), book);
				break;
				
			case 2:
				System.out.print("Enter ISBN: ");
				String isbn = sc.next();
				if (arr.containsKey(isbn))
					System.out.println(arr.get(isbn));
				else
					System.out.println("Book not found!");
				break;
				
			default:
				System.out.println("Kindly select a valid choice!");
				break;
			}
		}
	}
	
	// Q) Do we need to write equals() and hashCode() in Book class?
	// Ans: No, we do not need to override equals() and hashCode() in our class
	//		as Map does not allow duplicate keys to be added, but lets the value
	//		get updated on that key
	
	public static int menuChoice(Scanner sc) {
		int choice;
		
		System.out.println("---------------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Book");
		System.out.println("2. Find book");
		System.out.println("---------------------------");
		System.out.print("Select your choice: ");
		choice = sc.nextInt();
		System.out.println("---------------------------");
		
		return choice;
	}
}
