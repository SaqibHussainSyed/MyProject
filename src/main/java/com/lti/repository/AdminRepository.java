package com.lti.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lti.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Transactional
	@Query(value="select e.adminPassword from Admin e where e.adminLoginId=:adminLoginId")
	String getPassword(@Param("adminLoginId") int adminLoginId);
}
