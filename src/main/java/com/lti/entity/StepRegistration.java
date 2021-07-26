package com.lti.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



 
@Entity

public class StepRegistration {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int registrationId;
	private String userName;
	private String maritalStatus;
	private String aadharNo;
	private String stepStatus;
	private int userAge;
	private int noOfChildren;
	private String physicallyChallenged;
	private int ageOfChildren;
	private int ngoId;//ngoId
	
	
	public StepRegistration() {
		// TODO Auto-generated constructor stub
	}
	
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getStepStatus() {
		return stepStatus;
	}
	public void setStepStatus(String stepStatus) {
		this.stepStatus = stepStatus;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public String getPhysicallyChallenged() {
		return physicallyChallenged;
	}
	public void setPhysicallyChallenged(String physicallyChallenged) {
		this.physicallyChallenged = physicallyChallenged;
	}
	public int getAgeOfChildren() {
		return ageOfChildren;
	}
	public void setAgeOfChildren(int ageOfChildren) {
		this.ageOfChildren = ageOfChildren;
	}

	public int getNgoId() {
		return ngoId;
	}

	public void setNgoid(int ngoid) {
		this.ngoId = ngoid;
	}

	@Override
	public String toString() {
		return "StepRegistration [registrationId=" + registrationId + ", userName=" + userName + ", maritalStatus="
				+ maritalStatus + ", aadharNo=" + aadharNo + ", stepStatus=" + stepStatus + ", userAge=" + userAge
				+ ", noOfChildren=" + noOfChildren + ", physicallyChallenged=" + physicallyChallenged
				+ ", ageOfChildren=" + ageOfChildren + ", ngoId=" + ngoId + "]";
	}

	

	




	
	
	
	
}
