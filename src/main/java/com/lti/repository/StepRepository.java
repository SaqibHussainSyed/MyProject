package com.lti.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StepRegistration;



public interface StepRepository extends JpaRepository<StepRegistration, Integer>{

	@Query(value = "select e.aadharNo from StepRegistration e where e.aadharNo=:aadharNo")
	String findAadhar(@Param("aadharNo") String aadharNo); 
	
	@Transactional
	@Query(value="select stepuser from StepRegistration stepuser where stepuser.stepStatus =:status")
	List<StepRegistration> fetchAllUser(@Param ("status") String status);

	@Transactional
	@Modifying
	@Query(value="update StepRegistration stepuser set stepuser.stepStatus = :status WHERE stepuser.registrationId = :registrationId")
	void deleteUser(@Param ("registrationId") int registrationId,@Param ("status") String status);

	@Transactional
	@Modifying
	@Query(value="update StepRegistration stepuser set stepuser.stepStatus = :status WHERE stepuser.registrationId = :registrationId")
	void addUser(@Param ("registrationId") int registrationId,@Param ("status") String status);

	@Query(value="select stepuser.stepStatus from StepRegistration stepuser WHERE stepuser.aadharNo = :aadharNo")
	String checkStatus(@Param("aadharNo") String aadharNo);

}
