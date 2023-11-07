package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sunbeam.dbutil.DBUtil;
import com.sunbeam.pojo.Candidates;
import com.sunbeam.pojo.PartyVotes;

public class CandidateDAO {

	private Connection connection;
	private PreparedStatement psForUpdate;
	private PreparedStatement psForFindByParty;
	private PreparedStatement psForSave;
	private PreparedStatement psForDelete;
	private PreparedStatement psForFindById;
	private PreparedStatement psForFindAll;
	private PreparedStatement psForPartyVotes;

	public CandidateDAO() throws Exception {
		connection = DBUtil.getConnection();

		String updateQuery = "update candidates set name = ?, party = ?, votes = ? where id =?";
		psForUpdate = connection.prepareStatement(updateQuery);

		String findByParty = "Select * from candidates where party = ?";
		psForFindByParty = connection.prepareStatement(findByParty);
		
		String saveStatement = "insert into candidates values(default, ?, ?, ?)";
		psForSave = connection.prepareStatement(saveStatement);
		
		String deleteStatement = "delete from candidates where id = ?";
		psForDelete = connection.prepareStatement(deleteStatement);
		
		String findById = "select * from candidates where id = ?";
		psForFindById = connection.prepareStatement(findById);
		
		String findAll = "Select * from candidates";
		psForFindAll = connection.prepareStatement(findAll);
		
		String partyVotes = "Select party, sum(votes) from candidates group by party";
		psForPartyVotes = connection.prepareStatement(partyVotes);

	}

	public int update(Candidates c) throws Exception {

		psForUpdate.setString(1, c.getName());
		psForUpdate.setString(2, c.getParty());
		psForUpdate.setInt(3, c.getVotes());
		psForUpdate.setInt(4, c.getId());

		int count = psForUpdate.executeUpdate();
		return count;

	}

	public List<Candidates> findByParty(String party) throws Exception {
		List<Candidates> list = new ArrayList<Candidates>();

		psForFindByParty.setString(1, party);
		try (ResultSet resultSet = psForFindByParty.executeQuery()) {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String par = resultSet.getString("party");
				int votes = resultSet.getInt("votes");
				Candidates c = new Candidates(id, name, par, votes);
				list.add(c);
			}
		}
		return list;
	}
	
	public int save(Candidates c) throws Exception{
		psForSave.setString(1, c.getName());
		psForSave.setString(2, c.getParty());
		psForSave.setInt(3, c.getVotes());
		
		int count = psForSave.executeUpdate();
		return count;
	}
	
	public int deleteById(int id) throws Exception{
		psForDelete.setInt(1, id);
		
		int count = psForDelete.executeUpdate();
		return count;
	}
	
	public Candidates findById(int id) throws Exception{
		psForFindById.setInt(1, id);
		Candidates c=null;
		try(ResultSet resultSet = psForFindById.executeQuery()){
			if(resultSet.next()) {
				int id1 = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String par = resultSet.getString("party");
				int votes = resultSet.getInt("votes");
				
				 c = new Candidates(id1, name, par, votes);
			}
			return c;
		}
	}
	
	public List<Candidates> findAll() throws Exception{
		List<Candidates> list = new ArrayList<Candidates>();
		try(ResultSet resultSet = psForFindAll.executeQuery()){
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String par = resultSet.getString("party");
				int votes = resultSet.getInt("votes");
				
				Candidates c = new Candidates(id, name, par, votes);
				list.add(c);
			}
		}
		return list;
	}
	
	public List<PartyVotes> getPartywiseVotes() throws Exception{
		List<PartyVotes> list = new ArrayList<PartyVotes>();
		try(ResultSet resultSet = psForPartyVotes.executeQuery()){
			while(resultSet.next()) {
				String party = resultSet.getString("party");
				int votes = resultSet.getInt("sum(votes)");
				
				PartyVotes pv = new PartyVotes(party, votes);
				list.add(pv);
			}
		}
		return list;
	}
}





