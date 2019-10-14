package com.virtusa.entities;

public class Alumni 
{
	private int alumniId;
	private int courseId;
	private int yearOfCompletition;
	private String presentStatus;
	private String gender;
	public int getAlumniId() {
	return alumniId;
	}
	public void setAlumniId(int alumniId) {
	this.alumniId = alumniId;
	}
	public int getCourseId() {
	return courseId;
	}
	public void setCourseId(int courseId) {
	this.courseId = courseId;
	}
	public int getYearOfCompletition() {
	return yearOfCompletition;
	}
	public void setYearOfCompletition(int yearOfCompletition) {
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
	@Override
	public String toString() {
	return &quot;Alumni [alumniId=&quot; + alumniId + &quot;, courseId=&quot; + courseId + &quot;, yearOfCompletition=&quot;

	+ yearOfCompletition

	+ &quot;, presentStatus=&quot; + presentStatus + &quot;, gender=&quot; + gender + &quot;,

	getAlumniId()=&quot; + getAlumniId()

	+ &quot;, getCourseId()=&quot; + getCourseId() + &quot;, getYearOfCompletition()=&quot; +

	getYearOfCompletition()

	+ &quot;, getPresentStatus()=&quot; + getPresentStatus() + &quot;, getGender()=&quot; +

	getGender() + &quot;]&quot;;
	
}
}
