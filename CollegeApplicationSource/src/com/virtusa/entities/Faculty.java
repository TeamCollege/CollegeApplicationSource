package com.virtusa.entities;

public class Faculty extends User {
	
	private String facultyId;
	private String courseName; 
	private String departmentName;
	private int salary;
	
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
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
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", courseName=" + courseName + ", departmentName=" + departmentName
				+ ", salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
