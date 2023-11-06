package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
//		Collection<String> c = new HashSet<>();
//		Collection<String> c = new LinkedHashSet<>();
//		Collection<String> c = new TreeSet<>();
		
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}

}

// In which collection classes null is not allowed? Duplicate null is not allowed? 
// Multiple nulls are allowed?
// Ans:
// 1) TreeSet<> class does not allow NULL values.
// 2) HashSet<> and LinkedHashSet<> classes do no allow duplicate NULL values.
// 3) ArrayList<> class allows multiple NULL values.
