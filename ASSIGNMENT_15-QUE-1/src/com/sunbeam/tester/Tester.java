package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.dao.CandidateDAO;
import com.sunbeam.pojo.Candidates;
import com.sunbeam.pojo.PartyVotes;

public class Tester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		CandidateDAO cd = new CandidateDAO();
		
		int choice;
		
		do {
			System.out.println("1. Update Candidate");
			System.out.println("2. Find by Party");
			System.out.println("3. Save Candidate");
			System.out.println("4. Delete Candidate");
			System.out.println("5. Find Candidate by id");
			System.out.println("6. Display all Candidates");
			System.out.println("7. Party and Votes");
			System.out.println();
			System.out.print("Enter option - ");
			choice = sc.nextInt();
			System.out.println();
			
			switch (choice) {
			case 1:
				int count1 = cd.update(acceptData());
				System.out.println("-----" + count1 + " Updated-----");
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
				break;
				
			case 2:
				System.out.print("Enter Party Name - ");
				String party = sc.next();
				List<Candidates> list1;
				list1 = new CandidateDAO().findByParty(party);
				list1.forEach(e -> System.out.println(e));
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
				break;
				
			case 3:
				int count2 = cd.save(acceptData());
				System.out.println("-----" + count2 + " Saved-----");
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
				break;
				
			case 4:
				System.out.print("Enter id - ");
				int count3 = cd.deleteById(sc.nextInt());
				System.out.println("-----" + count3 + " deleted-----");
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
				break;
				
			case 5:
				System.out.print("Enter id - ");
				Candidates c = cd.findById(sc.nextInt());
				System.out.println(c.toString());
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
				break;
				
			case 6:
				List<Candidates> list2 = new ArrayList<Candidates>();
				list2 = cd.findAll();
				list2.forEach(e -> System.out.println(e));
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
				break;
				
			case 7:
				List<PartyVotes> pv = new ArrayList<PartyVotes>();
				pv = cd.getPartywiseVotes();
				pv.forEach(e -> System.out.println(e));
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
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
	
	public static Candidates acceptData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id - ");
		int id = sc.nextInt();
		System.out.print("Enter Name - ");
		String name = sc.next();
		System.out.print("Enter Party- ");
		String party = sc.next();
		System.out.print("Enter Votes - ");
		int votes = sc.nextInt();
		
		Candidates c = new Candidates(id, name, party, votes);
		return c;
	}

}
