package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int flag=0;

		Scanner sc = new Scanner(System.in);
		int choice;
		List<Book> list = new ArrayList<Book>();
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add new book in List");
			System.out.println("2.Display all books in forward order using random access");
			System.out.println("3.Search a book with given isbn");
			System.out.println("4.Delete a book at given index.");
			System.out.println("5.Delete a book with given isbn.");
			System.out.println("6.Delete a book with given name.");
			System.out.println("7.Sort books by isbn in asc order");
			System.out.println("8.Sort books by price in desc order");
			System.out.println("9.Reverse the list");

			System.out.println("enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Book book1 = new Book();
				book1.accept();

				if (list.contains(book1)) {
					int i = list.indexOf(book1);
					list.get(i).setQuantity(list.get(i).getQuantity() + book1.quantity);
				} else {
					list.add(book1);
				}

				break;
			case 2:
				for (int i = 0; i < list.size(); i++)
					list.get(i).display();
				break;
			case 3:
				System.out.println("enter isbn");
				String isbn = sc.next();
				for (int i = 0; i < list.size(); i++) {
					Book bb = list.get(i);
					if (isbn.equals(bb.isbn))
						list.get(i).display();
					flag=1;
					
				}
				if(flag!=1)
				System.out.println("Book not found");
				break;
			case 4:
				System.out.println("enter index to delete");
				int index=sc.nextInt();
				list.remove(index);
				break;
			case 5:
				System.out.println("enter isbn to delete");
				String isbn1=sc.next();
				for (int i = 0; i < list.size(); i++) {
				Book bbb=list.get(i);
			
					if(isbn1.equals(bbb.isbn))
				}
				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;

			default:
				break;
			}
		} while (choice != 0);
	}

}
