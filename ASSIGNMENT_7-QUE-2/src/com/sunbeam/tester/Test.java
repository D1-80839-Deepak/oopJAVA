package com.sunbeam.tester;

import com.sunbeam.Cricketer;
import com.sunbeam.Player;

public class Test {

	public static void main(String[] args) {
	Player []arr=new Player[2];
	for(int i=0;i<2;i++) {
		arr[i]=new Cricketer();
	arr[i].accept();

	}
	for(Player element:arr)
		System.out.println(element.toString());
	

	}

}
