package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import com.sunbeam.Book;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		Collection<Book> book = new ArrayList<Book>();
		Iterator<Book> itr = null;
		int flag = 0;
		do {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println();
			System.out.println("1. Add new Book");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Delete Book");
			System.out.println("4. Check Book Avaibility");
			System.out.println("5. Delete All Books");
			System.out.println("6. Display total Number of Books");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Enter option - ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Book b = new Book();
				b.acceptData();
				book.add(b);
				break;

			case 2:
				itr = book.iterator();
				while (itr.hasNext()) {
					Book book2 = itr.next();
					System.out.println(book2.toString());
//					System.out.println(itr.next().toString());
				}
				break;

			case 3:
				System.out.print("Enter ISBN Number - ");
				String str1 = sc.next();
				book.remove(new Book(str1));
 
				break;

			case 4:
				System.out.print("Enter ISBN Number - ");
				String str = sc.next();
				itr = book.iterator();
				flag = 0;
				while (itr.hasNext()) {
					Book bb = itr.next();
					if (bb.getIsbn().equals(str)) {
						System.out.println("Available");
						flag = 1;
						break;
					}
				}
				if (flag == 0)
					System.out.println("Book is not Available");

				break;

			case 5:
				book.clear();

				break;
				
			case 6:
				System.out.print("Number of Books - " + book.size());

				break;

			default:
				break;
			}

		} while (choice != 0);

	}

}