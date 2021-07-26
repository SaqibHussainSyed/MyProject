package com.lti.dao;

import java.util.List;

import com.lti.entity.Ngo;
import com.lti.entity.StepRegistration;

public interface AdminDao {

	String checkPassword(int adminLoginId);

	List<StepRegistration> fetchUser(String status);

	List<Ngo> fetchNgo(String status);

	void addUser(int registrationId, String status);

	void deleteUser(int registrationId, String status);

	void deleteNgo(int ngoId, String status);

	void addNgo(int ngoId, String status);

}
