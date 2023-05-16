package com.shivam.personalproj.model;

import com.shivam.personalproj.entity.User;

public class UserResponseModel {
	
	private String status;
	
	private User user;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
