package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sunbeam.dbutil.DBUtil;
import com.sunbeam.pojo.Users;

public class UsersDAO {
	
	private Connection connection;
	private PreparedStatement psForSave;
	private PreparedStatement psForFindAll;
	private PreparedStatement psForUpdate;
	private PreparedStatement psForDelete;
	
	public UsersDAO() throws Exception {
		connection = DBUtil.getConnection();
		
		String saveStatement = "insert into users values(default, ?, ?, ?, ?, ?, ?, ?)";
		psForSave = connection.prepareStatement(saveStatement);
		
		String findAll = "select * from users";
		psForFindAll = connection.prepareStatement(findAll);
		
		String updateStatement = "update users set first_name = ?, last_name = ?, email = ?, password = ?, dob  = ?, status = ?, role = ? from users";
		psForUpdate = connection.prepareStatement(updateStatement);
		
		String deleteStatement = "delete from users where id = ?";
		psForDelete = connection.prepareStatement(deleteStatement);
	}
	
	public int save(Users u) throws Exception{
		psForSave.setString(1, u.getFirst_name());
		psForSave.setString(2, u.getLast_name());
		psForSave.setString(3, u.getEmail());
		psForSave.setString(4, u.getPassword());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(u.getDob());
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		psForSave.setDate(5, sDate);
		
		psForSave.setInt(6, u.getStatus());
		psForSave.setString(7, u.getRole());
		
		int count = psForSave.executeUpdate();
		return count;
	}
	
	public List<Users> findAll() throws Exception{
		List<Users> list = new ArrayList<Users>();
		try(ResultSet resultSet = psForFindAll.executeQuery()){
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String first_name = resultSet.getString("first_name");
				String last_name = resultSet.getString("last_name");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				
				java.util.Date uDate = resultSet.getDate("dob");
				SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
				String date = sdf.format(uDate);
				
				int status = resultSet.getInt("status");
				String role = resultSet.getString("role");
				
				Users u = new Users(id, first_name, last_name, email, password, date, status, role);
				list.add(u);
			}
		}
		return list;
	}
	
	public int update(Users u) throws Exception {
		psForUpdate.setString(1, u.getFirst_name());
		psForUpdate.setString(2, u.getLast_name());
		psForUpdate.setString(3, u.getEmail());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate = new java.util.Date(u.getDob());
		java.sql.Date sDate = new java.sql.Date(udate.getTime());
		psForUpdate.setDate(4, sDate);
		
		
		psForUpdate.setInt(5, u.getStatus());
		psForUpdate.setString(1, u.getRole());
		
		int count = psForUpdate.executeUpdate();
		return count;
	}
	
	public int delete(int id) throws Exception{
		psForDelete.setInt(1, id);
		
		int count = psForDelete.executeUpdate();
		return count;
	}
	
}
