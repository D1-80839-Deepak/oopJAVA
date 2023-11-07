package com.sunbeam.pojo;

public class Users {
	int id;
	String first_name;
	String last_name;
	String email;
	String password;
	String dob;
	int status;
	String role;
	
	public Users() {
	}

	public Users(int id, String first_name, String last_name, String email, String password, String dob, int status,
			String role) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Users [id=").append(id).append(", first_name=").append(first_name).append(", last_name=")
				.append(last_name).append(", email=").append(email).append(", password=").append(password)
				.append(", dob=").append(dob).append(", status=").append(status).append(", role=").append(role)
				.append("]");
		return builder.toString();
	}
}
