package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement saveCandidate;
	private PreparedStatement FindById;
	private PreparedStatement FindAll;
	private PreparedStatement deleteById;
	
	
	

	public CandidateDao() throws Exception {
		con = Dbutil.getconnection();
		String sql3="insert into candidates values(Default,?,?,?)";
		saveCandidate=con.prepareStatement(sql3);
		
		String sql="select * from candidates where id = ?";
		FindById=con.prepareStatement(sql);
		
		String sql1="select * from candidates";
		FindAll=con.prepareStatement(sql1);
		
		String sql2="delete from candidates where id=?";
		deleteById=con.prepareStatement(sql2);
		
		
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int save(Candidate c) throws Exception{
		saveCandidate.setString(1, c.getName());
		saveCandidate.setString(2, c.getParty());
		saveCandidate.setInt(3, c.getVotes());
		int count=saveCandidate.executeUpdate();
		return count;	
	}
	public Candidate FindById(int id) {
		FindById.setInt(1, id);
		int count=FindById.executeUpdate();
		
	}
}
