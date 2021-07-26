package com.lti.service;

import com.lti.entity.Ngo;

public interface NgoService {

	String addNgo(Ngo ngo);

	String checkStatus(int ngoId);

}
