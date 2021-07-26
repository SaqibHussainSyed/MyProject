package com.lti.service;



import com.lti.entity.UserRegistration;

public interface UserService {
	
	public String addUser(UserRegistration user);
	
	public String checkPassword(String email, String password);

	
}

