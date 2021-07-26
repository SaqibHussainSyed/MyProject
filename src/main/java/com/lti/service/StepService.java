package com.lti.service;

import java.util.List;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;

public interface StepService {

	String addStepUser(StepRegistration stepRegistration);

	List<Ngo> viewNgo(String courseName);

	String checkStatus(String registrationId);

}