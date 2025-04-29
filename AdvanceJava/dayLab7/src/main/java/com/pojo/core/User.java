package com.pojo.core;

public class User {
	private String Username;
	private String Password;
	
	
	
	public User(String username, String password) {
		super();
		Username = username;
		Password = password;
		
		
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", Password=" + Password + "]";
	}
	

}
