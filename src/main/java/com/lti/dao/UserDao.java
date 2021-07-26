package com.lti.dao;

import com.lti.entity.UserLogin;
import com.lti.entity.UserRegistration;

public interface UserDao {
	
	public int addUser(UserRegistration user, UserLogin userLogin);
	
	public String checkPassword(String email);

}
