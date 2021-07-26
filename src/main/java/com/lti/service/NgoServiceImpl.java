package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NgoDao;
import com.lti.entity.Ngo;

@Service
public class NgoServiceImpl implements NgoService {
	@Autowired
	NgoDao ngoDao;

	public String addNgo(Ngo ngo) {
		
		int result= ngoDao.addNgo(ngo);
		if(result ==1) {
			return "Ngo added";
		}
		
		return "Ngo exist";
	
	}
	@Override
	public String checkStatus(int ngoId) {
		String status = ngoDao.checkStatus(ngoId);
		return status;
	}
}


