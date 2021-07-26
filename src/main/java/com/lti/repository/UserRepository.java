package com.lti.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lti.entity.UserRegistration;

@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Integer>{
	
	@Query(value="select e.email from UserRegistration e where e.email=:email")
	String findEmail(@Param("email") String email);
	
	

}

