package com.sunbeam;

import java.util.Scanner;

public class Main {
	 static Scanner sc= new Scanner(System.in);
	public static Candidate acceptCandidate() {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(id, name, party, votes);
		return c;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int choice;
		try {
		CandidateDao dao=new CandidateDao();
		do {
			System.out.println("0. Exit");
			System.out.println("1. save candidate");
			System.out.println("2. Find Candidate by id");
			System.out.println("3. Find all Candidate");
			System.out.println("4. Delete Candidate by id");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
		
				int count = dao.save(acceptCandidate());
				System.out.println(count+ " row affected");
				
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;

			default:
				break;
			}
		} while (choice != 0);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
