
package com.sunbeam.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import com.sunbeam.library.Book;
import com.sunbeam.sorting.SortByPriceDesc;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		List<Book> book = new ArrayList<Book>();

		Iterator<Book> itr = null;
		int flag = 0;
		do {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println();
			System.out.println("1. Add new Book");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Search a Book with given ISBN Number");
			System.out.println("4. Delete a Book of Given Index");
			System.out.println("5. Delete a Book with Given ISBN number");
			System.out.println("6. Delete the Book given Name");
			System.out.println("7. Sort a Book by ISBN in Asending");
			System.out.println("8. Sort a Book by Price in desending order");
			System.out.println("9. Reverse the List");
			System.out.println("10. Save book in file");
			System.out.println("11. Load book from file");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Enter option - ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Book b1 = new Book();
				b1.acceptData();
				flag = 0;
				String st = b1.getIsbn();
				for(int i = 0; i < book.size(); i++) {
					Book bb = book.get(i);
					if(bb.getIsbn().equals(st)) {
						bb.setQuantity(book.get(i).getQuantity() + b1.getQuantity());
						flag = 1;
					}
				}
				if(flag != 1) {
					book.add(b1);
				}
				break;

			case 2:
				for(int i = 0; i < book.size(); i++) {
					Book b = book.get(i);
					System.out.println(b.toString());
				}
				break;

			case 3:
				System.out.print("Enter ISBN Number - ");
				String str1 = sc.next();
				flag = 0;
				for(int i = 0; i < book.size(); i++) {
					Book b2 = book.get(i);
					if(b2.getIsbn().equals(str1)) {
						int id = book.indexOf(b2);
						System.out.println(book.get(id).toString());
//						System.out.println(b1.toString());
						flag = 1;
					}
				}
				if(flag != 1) {
					System.out.println("Sorry..... Book not found");
				}
				break;

			case 4:
				System.out.print("Enter Book Index - ");
				int bookin = sc.nextInt();
				if(bookin < book.size()) {
					book.remove(bookin);
				}
				break;

			case 5:
				System.out.print("Enter ISBN Number - ");
				String isbn = sc.next();
//				for(int i = 0; i < book.size(); i++) {
//					Book b3 = book.get(i);
//					if(b3.getIsbn().equals(isbn)) {
//						book.remove(b3);
//					}
//				}
				Book b=new Book(isbn);
					if(book.contains(b))
					{
						int index=book.indexOf(b);
						book.remove(book.get(index));
					}
				break;

			case 6:
				System.out.print("Enter Book Name - ");
				String name = sc.next();
				itr = book.iterator();
				for(int i = 0; i < book.size(); i++) {
					Book b4 = book.get(i);
					if(b4.getAuthorName().equals(name)) {
						book.remove(b4);
					}
				}
				break;
				
			case 7:
				Collections.sort(book);
				System.out.println("After Sorting in Ascending - ");
				System.err.println(book.toString());
				break;
				
				
			case 8:
				Collections.sort(book, new SortByPriceDesc());
				System.out.println("-----After Sorting In desending-----");
				System.out.println(book.toString());
				break;
				
			case 9:
				Collections.reverse(book);
				System.out.println("-----After Reverse-----");
				System.out.println(book.toString());

				break;
				
			case 10:
				Book book3 = new Book();
				book3.acceptData();
				book.add(book3);
				try(FileOutputStream fos = new FileOutputStream("book.bin")){
					try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
						oos.writeObject(book);
						System.out.println("-----"+book.size() + " Added-----");
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 11:
				List<Book> list;
				try(FileInputStream fis = new FileInputStream("book.bin")){
					try(ObjectInputStream ois = new ObjectInputStream(fis)){
						list = (List<Book>)ois.readObject();
						list.forEach(e -> System.out.println(e));
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;

			default:
				break;
			}

		} while (choice != 0);

	}

}