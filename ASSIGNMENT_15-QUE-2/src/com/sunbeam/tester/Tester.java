package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.dao.UsersDAO;
import com.sunbeam.pojo.Users;

public class Tester {

	public static void main(String[] args) {

		try {
		UsersDAO ud = new UsersDAO();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Save User");
			System.out.println("2. Display all User");
			System.out.println("3. Update User");
			System.out.println("4. Delete User");
			System.out.println();
			System.out.print("Enter option - ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				int count1 = ud.save(acceptData());
				System.out.println("-----" + count1 + " Saved-----");
				break;
				
			case 2:
				List<Users> list = new ArrayList<Users>();
				list = ud.findAll();
				list.forEach(e -> System.out.println(e));
				break;
				
			case 3:
				int count2 = ud.update(acceptData());
				System.out.println("-----" + count2 + " Updated-----");
				break;
				
			case 4:
				System.out.print("Enter id - ");
				int count3 =  ud.delete(sc.nextInt());
				System.out.println("-----" + count3 + " Deleted-----");
				break;

			default:
				break;
			}
			
		}while(choice != 0);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Users acceptData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id - ");
		int id = sc.nextInt();
		
		System.out.print("Enter First Name - ");
		String first_name = sc.next();
		
		System.out.print("Enter Last Name - ");
		String last_name = sc.next();
		
		System.out.print("Enter Email - ");
		String email = sc.next();
		
		System.out.print("Enter Password - ");
		String password = sc.next();
		
		System.out.print("Enter DOB in /'dd-mm-yyyy'/ - ");
		String dob = sc.next();
		
		System.out.print("Enter Status 1 and 0 - ");
		int status = sc.nextInt();
		
		System.out.print("Enter Role - ");
		String role = sc.next();
		
		Users u = new Users(1, first_name, last_name, email, password, dob, status, role);
		
		return u;
	}

}
