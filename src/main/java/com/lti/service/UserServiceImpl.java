package com.lti.service;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.lti.dao.UserDao;
import com.lti.entity.UserLogin;
import com.lti.entity.UserRegistration;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public String addUser(UserRegistration user) {
		
		UserLogin userLogin = new UserLogin(user.getEmail(), user.getPassword());
		int result = userDao.addUser(user,userLogin);
		
		if(result==1) {
			return "User Registered Successfully";
		}
		return "User Already Exists";
		
	}

	@Override
	public String checkPassword(String email, String password) {
		String userPassword = userDao.checkPassword(email);
		
		if(userPassword == null) {
			return "Please enter valid email id";
		}else if(userPassword.equals(password)) {
			return "Success";
			}
		return "Enter valid password";
	}


	}
	
	
	





