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
	private ExamSchedule examSchedule;
	private Results results;
	private PlacementCalender placementCalender;
	
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

	

	public ExamSchedule getExamSchedule() {
		return examSchedule;
	}

	public void setExamSchedule(ExamSchedule examSchedule) {
		this.examSchedule = examSchedule;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", tenthPercentage=" + tenthPercentage + ", interPercentage="
				+ interPercentage + ", courseName=" + courseName + ", departmentName=" + departmentName
				+ ", classSchedule=" + classSchedule + "]";
	}

	public ClassSchedule getClassSchedule() {
		return classSchedule;
	}

	public void setClassSchedule(ClassSchedule classSchedule) {
		this.classSchedule = classSchedule;
	}

	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

	public PlacementCalender getPlacementCalender() {
		return placementCalender;
	}

	public void setPlacementCalender(PlacementCalender placementCalender) {
		this.placementCalender = placementCalender;
	}

	
	
	

}
