package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringClass {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Collections.addAll(list,"Deepak","Amol","Shubham","Salman","Shahrukh","AMIT");
		System.out.println(list);
//		Collections.max(list,new lengthComparator());
		System.out.println("Name with highest length :"+Collections.max(list,new lengthComparator()));
		
	}

}
