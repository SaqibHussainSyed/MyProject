package com.lti.dao;

import com.lti.entity.Ngo;

public interface NgoDao {

	int addNgo(Ngo ngo);

	String checkStatus(int ngoId);

}
