package com.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lti.entity.UserLogin;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, String>{
	
	  @Query(value="select e.password from UserLogin e where e.email=:email") 
	  String getPassword(@Param("email") String email);
	 

}

