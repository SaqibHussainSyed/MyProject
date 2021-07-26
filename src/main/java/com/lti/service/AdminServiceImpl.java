package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminDao;
import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	@Override
	public String checkPassword(int adminLoginId, String adminPassword) {
		String userPassword = adminDao.checkPassword(adminLoginId);
		
		if(userPassword == null) {
			return "Please enter valid login id";
		}else if(userPassword.equals(adminPassword)) {
			return "Login Successfull";
			}
		return "Please enter valid password";
	}

	@Override
	public List<StepRegistration> fetchUser() {
		String status = "Pending";
		List <StepRegistration> userlist = adminDao.fetchUser(status);
		return userlist;
	}

	@Override
	public List<Ngo> fetchNgo() {
		String status = "Pending";
		List <Ngo> ngolist = adminDao.fetchNgo(status);
		return ngolist;

	}

	@Override
	public void addUser(int registrationId) {

		String status = "Approved";
		adminDao.addUser(registrationId,status);


	}

	@Override
	public void deleteUser(int registrationId) {
		String status = "Not Approved";
		adminDao.deleteUser(registrationId, status);
		
	}

	@Override
	public void addNgo(int ngoId) {
		String status = "Approved";
		adminDao.addNgo(ngoId,status);

	}

	@Override
	public void deleteNgo(int ngoId) {
		String status = "Not Approved";
		adminDao.deleteNgo(ngoId, status);

		
	}
}


