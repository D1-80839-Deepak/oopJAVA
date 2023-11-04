package com.sunbeam;

import java.util.Scanner;

public class Main {
	static <T> int countIf(T[] arr, T key, check<T> c)
	{
		int count=0;
		for(T ele:arr) {
			if(c.compare(ele, key))
				count++;
		}
			
		return count;
	}
	public static void main(String[] args) {
		Double [] arr = {44.0, 77.0, 12.0, 2.5, 5.5, 77.0,12.0,2.5,77.0};
		
		System.out.println("Enter key to find");
		Scanner sc=new Scanner(System.in);
		double key=sc.nextDouble();
		
		int cnt = countIf(arr, key, (x,y)-> x.equals(y));
		System.out.println("Count = " + cnt);

	}

}
