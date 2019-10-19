package com.virtusa.entities;

public class Student extends User
{
	private int studentId;
	private double tenthPercentage;
	private double interPercentage;
	private String courseName;
	private String departmentName;
//12.10.19
	private ClassSchedule classSchedule;
	//private ExamSchedule examSchedule;
	
	public Student() {}
	
	public int getStudentId() 
	{
		return studentId;    
	}

	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	public double getTenthPercentage() {
		return tenthPercentage;
	}

	public void setTenthPercentage(double tenthPercentage) {
		this.tenthPercentage = tenthPercentage;
	}

	public double getInterPercentage() {
		return interPercentage;
	}

	public void setInterPercentage(double interPercentage) {
		this.interPercentage = interPercentage;
	}
	
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
				+ ", getStudentId()=" + getStudentId() + ", getUserName()=" + getUserName() + ", getPassword()="
				+ getPassword() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getEmailAddress()=" + getEmailAddress()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public ClassSchedule getClassSchedule() {
		return classSchedule;
	}

	public void setClassSchedule(ClassSchedule classSchedule) {
		this.classSchedule = classSchedule;
	}

	
	
	

}
