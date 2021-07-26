package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;
import com.lti.repository.AdminRepository;
import com.lti.repository.NgoRepository;
import com.lti.repository.StepRepository;

@Repository
@Transactional
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private AdminRepository repository;
	@Autowired
	private StepRepository userrepository;
	
	@Autowired
	private NgoRepository ngorepository;

	
	@Override
	public String checkPassword(int adminLoginId) {
		
		String password = repository.getPassword(adminLoginId);
		return password;
		
	}

	@Override
	public List<StepRegistration> fetchUser(String status) {
		List<StepRegistration> userlist = userrepository.fetchAllUser(status);
		return userlist;

	}

	@Override
	public List<Ngo> fetchNgo(String status) {
		List<Ngo> ngolist = ngorepository.fetchAllNgo(status);
		return ngolist;

	}

	@Override
	public void addUser(int registrationId, String status) {
		userrepository.addUser(registrationId, status);

		
	}

	@Override
	public void deleteUser(int registrationId, String status) {
		userrepository.deleteUser(registrationId,status);

		
	}

	@Override
	public void deleteNgo(int ngoId, String status) {
		ngorepository.deleteNgo(ngoId, status);

		
	}

	@Override
	public void addNgo(int ngoId, String status) {
		ngorepository.addNgo(ngoId, status);

		
	}

}

