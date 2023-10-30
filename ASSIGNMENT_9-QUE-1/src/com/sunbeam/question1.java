package com.sunbeam;

public class question1 {

	public static void main(String[] args) {
		String str1 = "sun";
		String str2 = "sunbeam";
		int result = str1.compareToIgnoreCase(str2);
		System.out.println("result :" + result);
		
		boolean res1 = str1.equals(str2);
		System.out.println("result :" + res1);

		System.out.println(str1 == str2);

		System.out.println(str1.hashCode());
		System.out.println(str1.startsWith("un"));
		System.out.println(str2.endsWith("am"));
		System.out.println(str2.charAt(5));
		
		System.out.println(str1.concat(str2));
		
		String str3= "I am Iron Man";
		String[]arr=str3.split(" ");
		for(String element:arr)
		System.out.println("element :"+element);
		System.out.println("---------------------------------------------------");
		System.out.println("STRING BUFFER");
		StringBuffer str4=new StringBuffer("deepaknikhare");
		StringBuffer str5=new StringBuffer("sunbeaminfo");
		
		System.out.println(str4==str5);
		System.out.println(str4.equals(str5));
		System.out.println(str4.capacity());
		System.out.println(str5.replace(0,5,str1));
		System.out.println("---------------------------------------------------");
		System.out.println("STRING BUILDER");
		
		StringBuilder s1 = new StringBuilder("Sunbeam");
		StringBuilder s2 = new StringBuilder("SunBeam");
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString());
		
	}

}
