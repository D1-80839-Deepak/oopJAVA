package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Book> set = new HashSet<Book>();
		set.add(new Book("a", 10.0, "deepak1", 10));
		set.add(new Book("b", 12.0, "deepak2", 11));
		set.add(new Book("c", 14.0, "deepak3", 12));
		set.add(new Book("d", 16.0, "deepak4", 13));
		set.add(new Book("e", 18.0, "deepak5", 14));
		// if any duplicate valje is added then it do not take that value.it will not be
		// added to the HashSet. here duplicate value is check on isbn value

		// The order of books in the HashSet will be unordered.
		set.add(new Book("c", 14.0, "deepak", 12));
		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
	}

}
