package com.lti.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ngo {

	@Id
	private int ngoId;
	private String ngoName;
	private String ngoLocation;
	private String ngoStatus;
	private int courseId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date startDate;
	private int capacity;
	//int count
	

	public Ngo() {
		// TODO Auto-generated constructor stub
	}


	public int getNgoId() {
		return ngoId;
	}


	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}


	public String getNgoName() {
		return ngoName;
	}


	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}


	public String getNgoLocation() {
		return ngoLocation;
	}


	public void setNgoLocation(String ngoLocation) {
		this.ngoLocation = ngoLocation;
	}


	public String getNgoStatus() {
		return ngoStatus;
	}


	public void setNgoStatus(String ngoStatus) {
		this.ngoStatus = ngoStatus;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Ngo [ngoId=" + ngoId + ", ngoName=" + ngoName + ", ngoLocation=" + ngoLocation + ", ngoStatus="
				+ ngoStatus + ", courseId=" + courseId + ", startDate=" + startDate + ", capacity=" + capacity + "]";
	}




}

