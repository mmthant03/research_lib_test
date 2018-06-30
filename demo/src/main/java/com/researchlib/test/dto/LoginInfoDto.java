package com.researchlib.test.dto;

public class LoginInfoDto {
	
	private String username;
	private String password;
	
	public LoginInfoDto() {
		// empty constructor
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginInfoDto [username=" + username + ", password=" + password + "]";
	}
	
	
}
