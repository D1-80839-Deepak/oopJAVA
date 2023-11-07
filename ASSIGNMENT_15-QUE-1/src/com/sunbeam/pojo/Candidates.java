package com.sunbeam.pojo;

public class Candidates {
	int id;
	String name;
	String party;
	int votes;
	
	public Candidates() {
		
	}

	public Candidates(int id, String name, String party, int votes) {
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidates [id=").append(id).append(", name=").append(name).append(", party=").append(party)
				.append(", votes=").append(votes).append("]");
		return builder.toString();
	}
}
