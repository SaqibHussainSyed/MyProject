package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.repository.UserLoginRepository;

@Repository
public class MailDaoImpl implements MailDao {
    
	@Autowired
	UserLoginRepository repository;

	@Override
	public String getpassword(String emailid) {

		String pass = repository.getPassword(emailid);
		if (pass.equals(null)) {
			return null;
		} else {
			return pass;
		}
	}

}
