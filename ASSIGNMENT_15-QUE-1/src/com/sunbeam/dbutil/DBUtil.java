package com.sunbeam.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/java";
	public static final String DB_USER = "D1_80839_deepak";
	public static final String DB_PASSSWD = "97667";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static Connection getConnection() throws Exception{
		Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD);
		return connection;
	}
}