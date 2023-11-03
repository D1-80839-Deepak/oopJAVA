package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

		public static void main(String[] args) {
			Set<Book> set = new LinkedHashSet<Book>();
			set.add(new Book("c", 14.0, "deepak3", 12));
			set.add(new Book("d", 16.0, "deepak4", 13));
			set.add(new Book("e", 18.0, "deepak5", 14));
			set.add(new Book("a", 10.0, "deepak1", 10));
			set.add(new Book("b", 12.0, "deepak2", 11));
			
			// if any duplicate value is added then it do not take that value.it will not be
			// added to the LinkedHashSet. here duplicate value is check on isbn value

			// The order of books in the LinkedHashSet will be as per order of insertion.
			set.add(new Book("c", 14.0, "deepak", 12));
			Iterator<Book> itr = set.iterator();
			while (itr.hasNext()) {
				Book ele = itr.next();
				System.out.println(ele);
			}
		}

	}


