package com.virtusa.model;

public class ResultsModel {

	private String subject1Name;
	private String subject2Name;
	private int subject1Marks;
	private int subject2Marks;
	private String finalresult;
	private int studentId;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getSubject1Name() {
		return subject1Name;
	}
	public void setSubject1Name(String subject1Name) {
		this.subject1Name = subject1Name;
	}
	public String getSubject2Name() {
		return subject2Name;
	}
	public void setSubject2Name(String subject2Name) {
		this.subject2Name = subject2Name;
	}
	public int getSubject1Marks() {
		return subject1Marks;
	}
	public void setSubject1Marks(int subject1Marks) {
		this.subject1Marks = subject1Marks;
	}
	public int getSubject2Marks() {
		return subject2Marks;
	}
	public void setSubject2Marks(int subject2Marks) {
		this.subject2Marks = subject2Marks;
	}
	public String getFinalresult() {
		return finalresult;
	}
	public void setFinalresult(String finalresult) {
		this.finalresult = finalresult;
	}
	@Override
	public String toString() {
		return "ResultsModel [subject1Name=" + subject1Name + ", subject2Name=" + subject2Name + ", subject1Marks="
				+ subject1Marks + ", subject2Marks=" + subject2Marks + ", finalresult=" + finalresult + "]";
	}
	
	
	
}
