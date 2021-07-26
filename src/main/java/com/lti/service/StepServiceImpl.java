package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.StepDao;
import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;

@Service
public class StepServiceImpl implements StepService {
	
	@Autowired 
	StepDao stepDao;
	
	
	
	@Override
	public String addStepUser(StepRegistration stepRegistration) {
		//count 
		int result=stepDao.addSetUser(stepRegistration);
		if(result==1) {
			return "User Registered";
		}
		
			return "User Exist";
		
	}



	@Override
	public List<Ngo> viewNgo(String courseName) {
		List<Ngo> result=stepDao.viewNgo(courseName);
		return result;
	}
	
	
	@Override
	public String checkStatus(String aadharNo) {
		String status = stepDao.checkStatus(aadharNo);
		return status;
	}
}
