package com.ibm.shopping.beans;

public class User {
	private int userId, contactNumber;
	private String fName, lName, email, password, address, imgPath;
	
	public User() {
		
	}
	
	public User(int userId, int contactNumber, String fName, String lName, String email, String password,
			String address, String imgPath) {
		this.userId = userId;
		this.contactNumber = contactNumber;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.imgPath = imgPath;
	}
	

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
