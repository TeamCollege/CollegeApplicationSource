package com.virtusa.entities;

public class Alumni extends User
{
	private int alumniId;
	private int yearOfCompletition;
	private String presentStatus;
	private String gender;
	
	public Alumni() {}
	public int getAlumniId() {
	return alumniId;
	}
	
	    
	public void setAlumniId(int alumniId) {
	this.alumniId = alumniId;
	}
	
	public void setYearOfCompletition(int yearOfCompletition) {
		this.yearOfCompletition = yearOfCompletition;
		}
	
	public int getYearOfCompletition() {
	return yearOfCompletition;
	}
	
	public String getPresentStatus() {
	return presentStatus;
	}
	public void setPresentStatus(String presentStatus) {
	this.presentStatus = presentStatus;
	}
	public String getGender() {
	return gender;
	}
	public void setGender(String gender) {
	this.gender = gender;
	}
	@Override
	public String toString() {
		return "Alumni [alumniId=" + alumniId + ", yearOfCompletition=" + yearOfCompletition + ", presentStatus="
				+ presentStatus + ", gender=" + gender + ", getAlumniId()=" + getAlumniId()
				+ ", getYearOfCompletition()=" + getYearOfCompletition() + ", getPresentStatus()=" + getPresentStatus()
				+ ", getGender()=" + getGender() + "]";
	}


	
	
}
