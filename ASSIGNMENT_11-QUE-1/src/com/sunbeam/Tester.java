package com.sunbeam;
import java.util.Arrays;

import com.sunbeam.Compare;

public class Tester {

	public static void main(String[] args) {

		Double arr[] = { 1.1, 5.4, 0.1, 6.8, 9.12, 4.7, 6.8, 10.10 };
		
		System.out.print("Before Sort - " + Arrays.toString(arr));
		System.out.println();
		
		Arrays.sort(arr, new Compare());
		System.out.print("After Sort - " + Arrays.toString(arr));

	}
}
