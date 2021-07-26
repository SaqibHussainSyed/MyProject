package com.lti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Ngo;

public interface NgoRepository extends JpaRepository<Ngo, Integer> {
	

	@Transactional
	@Modifying
	@Query(value="select ngo from Ngo ngo where ngo.ngoStatus =:status")
	List<Ngo> fetchAllNgo(@Param ("status") String status);

	@Transactional
	@Modifying
	@Query(value="update Ngo ngo set ngo.ngoStatus = :status WHERE ngo.ngoId = :ngoId")
	void deleteNgo(@Param ("ngoId") int ngoId, @Param ("status") String status);

	@Transactional
	@Modifying
	@Query(value="update Ngo ngo set ngo.ngoStatus = :status WHERE ngo.ngoId = :ngoId")
	void addNgo(@Param ("ngoId") int ngoId, @Param ("status") String status);
	
	 @Query(value="select ngo from Ngo ngo where ngo.ngoStatus= :status and ngo.courseId=(select courseId from Course c where c.courseName=:courseName )") 
	 List<Ngo> viewNgo(@Param("courseName") String courseName ,@Param("status")String status);

	 @Query(value="select ngo.ngoStatus from Ngo ngo WHERE ngo.ngoId = :ngoId")
		String checkStatus(@Param("ngoId") int ngoId);

}
