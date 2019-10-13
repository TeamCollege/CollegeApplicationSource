package com.virtusa.entities;

import java.sql.Date;

public class User {

	private String userName;
	private String password;
	
	protected String firstName;
	protected String lastName;
	protected Date dateOfBirth;
	protected String emailAddress;
	protected String phoneNumber;
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhoneNumber() 
	{ 
		return phoneNumber;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}
