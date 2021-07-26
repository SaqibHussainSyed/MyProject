package com.lti.service;

import java.util.List;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;

public interface AdminService {

	String checkPassword(int adminLoginId, String adminPassword);

	List<StepRegistration> fetchUser();

	List<Ngo> fetchNgo();

	void addUser(int registrationId);

	void deleteUser(int registrationId);

	void addNgo(int ngoId);

	void deleteNgo(int ngoId);

}
