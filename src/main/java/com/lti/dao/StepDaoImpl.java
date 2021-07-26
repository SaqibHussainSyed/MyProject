package com.lti.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;
import com.lti.repository.NgoRepository;
import com.lti.repository.StepRepository;

@Repository
@Transactional
public class StepDaoImpl implements StepDao {

	@Autowired
	StepRepository repository;
	
	@Autowired
	NgoRepository ngorepository;
	
	@Override
	public int addSetUser(StepRegistration stepRegistration) {
		
		
		String result=repository.findAadhar(stepRegistration.getAadharNo());
		if(result==null) {
		repository.save(stepRegistration);
		System.out.println(stepRegistration);
		return 1;
	
		}
		return 0;
	}

	@Override
	public List<Ngo> viewNgo(String courseName) {
		
		List<Ngo> ngo=ngorepository.viewNgo(courseName,"Approved");
		
		return ngo;
	}
	
	@Override
	public String checkStatus(String aadharNo) {
		String status = repository.checkStatus(aadharNo);
		return status;
	}
	
}
