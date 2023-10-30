package com.sunbeam;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		StringBuilder str1 = new StringBuilder(sc.next());
		String str= new String(str1);
		
		String str2=new String(str1.reverse());
      
		if(str.equals(str2))
			System.out.println("string is Palindrom");
		else
			System.out.println("string is not Palindrom");
	}

}
