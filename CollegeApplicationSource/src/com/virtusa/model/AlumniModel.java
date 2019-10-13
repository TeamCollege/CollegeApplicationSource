package com.virtusa.model;

public class AlumniModel {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private int courseId;
	private int alumniId;
	private String dateOfBirth;
	private String gender;
	private String presentStatus;
	private String yearOfCompletition;
	
	 
	
	

	public String getYearOfCompletition() {
		return yearOfCompletition;
	}
	public void setYearOfCompletition(String yearOfCompletition) {
		this.yearOfCompletition = yearOfCompletition;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getAlumniId() {
		return alumniId;
	}
	public void setAlumniId(int alumniId) {
		this.alumniId = alumniId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "AlumniModel [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", courseId=" + courseId + ", alumniId=" + alumniId + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", presentStatus=" + presentStatus + ", yearOfCompletition="
				+ yearOfCompletition + ", getYearOfCompletition()=" + getYearOfCompletition() + ", getPresentStatus()="
				+ getPresentStatus() + ", getGender()=" + getGender() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getCourseId()=" + getCourseId() + ", getAlumniId()=" + getAlumniId()
				+ ", getDateOfBirth()=" + getDateOfBirth() + "]";
	}
	
	
	
	

}


