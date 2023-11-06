package com.sunbeam;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

import com.sunbeam.Book;
import com.sunbeam.priceComparator;

public class Tester {

	public static void main(String[] args) {

		NavigableSet<Book> arr = new TreeSet<Book>(new priceComparator());

		arr.add(new Book("1", "janak", 2, 500.0));
		arr.add(new Book("8", "rohan", 5, 600));
		arr.add(new Book("2", "parimal", 1, 505.80));
		arr.add(new Book("6", "ashutosh", 2, 2500));
		arr.add(new Book("4", "tejas", 9, 505.05));
		arr.add(new Book("9", "deepak", 4, 1000.50));
		
		// Book with duplicate isbn of 9
		arr.add(new Book("9", "sameer", 4, 2000));
		
		// Display all books using iterator()
		System.out.println("\nUsing iterator()\n");
		Iterator<Book> itr1 = arr.iterator();
		while (itr1.hasNext()) {
			Book book = itr1.next();
			System.out.println(book.toString());
		}
		// Display all books using descendingIterator()	
		System.out.println("\nUsing descendingIterator()\n");
		Iterator<Book> itr2 = arr.descendingIterator();
		while (itr2.hasNext()) {
			Book book = itr2.next();
			System.out.println(book.toString());
		}
	}
}