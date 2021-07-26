package com.lti.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.UserLogin;
import com.lti.entity.UserRegistration;
import com.lti.repository.UserLoginRepository;
import com.lti.repository.UserRepository;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserLoginRepository loginrepository;

	@Override
	public int addUser(UserRegistration user, UserLogin userLogin) {
		
		String result = repository.findEmail(user.getEmail());
		if (result==null) {
			repository.save(user);
			loginrepository.save(userLogin);
			System.out.println(user);
			return 1;
		} 
		
		return 0;
		
	}

	@Override
	public String checkPassword(String email) {
		
		String password = loginrepository.getPassword(email);
		if(password == null) {
			return null;
		}
		return password;
		
	}

	
	
	

}





