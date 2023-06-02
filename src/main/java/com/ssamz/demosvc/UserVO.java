package com.ssamz.demosvc;

public class UserVO {
	private String userID;
	private String userName;
	private String phone;
	private String email;
	
	public UserVO(String userID, String userName, String phone, String email) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
	}
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
