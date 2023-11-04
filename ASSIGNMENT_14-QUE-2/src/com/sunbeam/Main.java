package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/java";
	public static final String DB_USER = "D1_80839_deepak";
	public static final String DB_PASS = "97667";
	public static SimpleDateFormat sdf;

	static {
		try {
			Class.forName(DB_DRIVER);
			sdf=new SimpleDateFormat("dd-MM-yyyy");
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
				System.out.println("1.Insert new user (Voter)");
				System.out.println("2.Display all users");
				System.out.println("3.Delete voter with given id");
				System.out.println("4.Change status of voter with given id to true");
				System.out.println("5.Change the name and birth date of voter");

				System.out.println("enter choice");

				choice = sc.nextInt();
				switch (choice) {
				case 1:
					String sql = "insert into users values(default,?,?,?,?,?,?,?)";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter First Name :");
						String fname = sc.next();
						
						System.out.println("Enter Last Name :");
						String lname = sc.next();
						
						System.out.println("Enter Email :");
						String email = sc.next();
						
						System.out.println("Enter Password :");
						String pass = sc.next();
						
						System.out.println("Enter Date Of Birth :");
						String datestr = sc.next();
						java.util.Date uDate=sdf.parse(datestr);
						
						
						System.out.println("Enter Status :");
						Boolean status = sc.nextBoolean();
						
						System.out.println("Enter role :");
						String role = sc.next();

						stmt.setString(1, fname);
						stmt.setString(2, lname);
						stmt.setString(3, email);
						stmt.setString(4, pass);
						stmt.setDate(5, new java.sql.Date(uDate.getTime()));
						stmt.setBoolean(6, status);
						stmt.setString(7, role);
						int count = stmt.executeUpdate();
						System.out.println("Row Affected " + count);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					String sql1 = "select * from users";
					try (PreparedStatement stmt = con.prepareStatement(sql1)) {
						
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String fname = rs.getString("first_name");
								String lname= rs.getString("last_name");
								String email = rs.getString("email");
								String pass = rs.getString("password");
								java.sql.Date sdate;
								sdate = rs.getDate("dob");
								String datestr=sdf.format(sdate);
								boolean status = rs.getBoolean("status");
								String role = rs.getString("role");
//								System.out.printf("%d, %s, %s, %s,%s,%s,%d,%s\n",
//										id, fname, lname, email,pass,datestr,status,role);
								System.out.println(id +fname+ lname+ email+pass+datestr+status+role);
							}
						} 
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;

				case 3:
					String sql2 = "delete from users where id=?";
					try (PreparedStatement stmt = con.prepareStatement(sql2)) {
						System.out.println("enter id");
						int id1=sc.nextInt();
						
						stmt.setInt(1, id1);
						 int count = stmt.executeUpdate();
						 System.out.println(count+" row is deleted");
						
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;

				case 4:
					String sql3 = "update users set status=1 where id= ?";
					try (PreparedStatement stmt = con.prepareStatement(sql3)) {
						System.out.println("enter id");
						int id1=sc.nextInt();
						
						stmt.setInt(1, id1);
						 int count = stmt.executeUpdate();
						 System.out.println(count+" row is affected");
						
					} catch (Exception e) {
						e.printStackTrace();
					}


					break;

				case 5:
					String sql4 = "update users set first_name=? ,last_name=? , dob=? where id=?";
					try (PreparedStatement stmt = con.prepareStatement(sql4)) {
						System.out.println("enter id");
						int id1=sc.nextInt();
						
						System.out.println("enter new first name");
						String fname=sc.next();
						System.out.println("enter new last name");
						String lname=sc.next();
						System.out.println("enter new date of birth");
						String datestr = sc.next();
						java.util.Date uDate=sdf.parse(datestr);
						
						stmt.setString(1, fname);
						stmt.setString(2, lname);
						stmt.setDate(3, new java.sql.Date(uDate.getTime()));
						stmt.setInt(4, id1);
						 int count = stmt.executeUpdate();
						 System.out.println(count+" row is affected");
						
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
