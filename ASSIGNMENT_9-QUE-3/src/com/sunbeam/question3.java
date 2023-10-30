package com.sunbeam;

public class question3 {

	public static void main(String[] args) {
	String []arr= {"deepak","vowel","people","pluto"};
//	for(String element:arr)
	for(int i=0;i<arr.length;i++) {
		if(arr[i].charAt(arr[i].length()-1)=='a'|| arr[i].charAt(arr[i].length()-1)=='e'|| arr[i].charAt(arr[i].length()-1)=='i'|| arr[i].charAt(arr[i].length()-1)=='o'|| arr[i].charAt(arr[i].length()-1)=='u')
	
	System.out.println("strings end with vowel :"+arr[i]);
	}
	}

}
