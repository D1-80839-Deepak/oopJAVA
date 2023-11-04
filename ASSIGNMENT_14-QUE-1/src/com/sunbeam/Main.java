package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/java";
	public static final String DB_USER = "D1_80839_deepak";
	public static final String DB_PASS = "97667";
	static {
		try {
			Class.forName(DB_DRIVER);

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
			do {
				System.out.println("0.Exit");
				System.out.println("1.Insert new candidate");
				System.out.println("2.Display all candidates");
				System.out.println("3.Increment votes of candidate with given id");
				System.out.println("4.Delete candidate with given id");
				System.out.println("5.Find candidate of given id");
				System.out.println("6.Find candidates of given party");
				System.out.println("7.Display total votes for each party");
				System.out.println("enter choice");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					
					String sql = "insert into candidates values(default,?,?,?)";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter Name :");
						String name = sc.next();
						System.out.println("Enter party :");
						String party = sc.next();
						System.out.println("Enter Votes :");
						int votes = sc.nextInt();

						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);
						int count = stmt.executeUpdate();
						System.out.println("Row Affected " + count);
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;
				case 2:
					String sql1 = "select * from candidates";
					try (PreparedStatement stmt = con.prepareStatement(sql1)) {
						
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						} 
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;
				case 3:
					String sql2 = "update candidates set votes=votes+100 where id= ?";
					try (PreparedStatement stmt = con.prepareStatement(sql2)) {
						System.out.println("enter id");
						int id1=sc.nextInt();
						
						stmt.setInt(1, id1);
						 int count = stmt.executeUpdate();
						 System.out.println("Updated by 100");
						
					} catch (Exception e) {
						e.printStackTrace();
					}


					break;
				case 4:
					String sql3 = "delete from candidates where id=?";
					try (PreparedStatement stmt = con.prepareStatement(sql3)) {
						System.out.println("enter id");
						int id1=sc.nextInt();
						
						stmt.setInt(1, id1);
						 int count = stmt.executeUpdate();
						 System.out.println(count+" row is deleted");
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;
				case 5:
					String sql4 = "select * from candidates where id=?";
					try (PreparedStatement stmt = con.prepareStatement(sql4)) {
						System.out.println("enter id");
						int id1=sc.nextInt();
						stmt.setInt(1, id1);
						
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						} 
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 6:
					String sql5 = "select * from candidates where party=?";
					try (PreparedStatement stmt = con.prepareStatement(sql5)) {
						System.out.println("enter party name");
						String p=sc.next();
						stmt.setString(1, p);
						
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						} 
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;
				case 7:
					String sql6 = "select votes from candidates";
					try (PreparedStatement stmt = con.prepareStatement(sql6)) {
						
						
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								
								int votes = rs.getInt("votes");
								System.out.printf("%d\n",votes);
							}
						} 
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;

				default:
					break;
				}
			} while (choice != 0);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
