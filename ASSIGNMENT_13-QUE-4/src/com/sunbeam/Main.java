package com.sunbeam;

import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
			Set<Book> set = new TreeSet<Book>();
			set.add(new Book("c", 14.0, "deepak3", 12));
			set.add(new Book("d", 16.0, "deepak4", 13));
			set.add(new Book("e", 18.0, "deepak5", 14));
			set.add(new Book("a", 10.0, "deepak1", 10));
			set.add(new Book("b", 12.0, "deepak2", 11));
			
			//The elements are automatically sorted, and duplicates are not allowed. 
			// 

			//The elements are maintained in sorted order according to their natural ordering .
			// Here natural ordering is on the basis of isbn
			
			set.add(new Book("c", 18.0, "deepak", 12));
			
			Iterator<Book> itr = set.iterator();
			while (itr.hasNext()) {
				Book ele = itr.next();
				System.out.println(ele);
			}
		}

	}


