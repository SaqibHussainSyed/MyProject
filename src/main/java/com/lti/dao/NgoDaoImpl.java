package com.lti.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.entity.Ngo;
import com.lti.repository.NgoRepository;

@Repository
@Transactional
public class NgoDaoImpl implements NgoDao {
	@Autowired
	NgoRepository repository;
	
	
	
	

	@Override
	public int addNgo(Ngo ngo) {
		

		Optional<Ngo> ngoCheck = repository.findById(ngo.getNgoId());
		boolean res = ngoCheck.isPresent();
		if(res)
		{
			return 0;
		}
		else {
		repository.save(ngo);
		System.out.println(ngo);
		return 1;	
		}
	}
	@Override
	public String checkStatus(int ngoId) {
		String status = repository.checkStatus(ngoId);
		return status;
	}

}
