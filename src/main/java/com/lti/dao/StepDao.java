package com.lti.dao;

import java.util.List;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;

public interface StepDao {

	int addSetUser(StepRegistration stepRegistration);

	List<Ngo> viewNgo(String courseName);

	String checkStatus(String aadharNo);

	

}