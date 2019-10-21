package com.virtusa.entities;

import java.sql.Date;
import java.time.LocalDate;

public class ExamSchedule {
	private String examId;
	private String examType;
	private String examName;
	private Date examDate;
	private String examSubject1;
	private String examSubject2;
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getExamSubject1() {
		return examSubject1;
	}
	public void setExamSubject1(String examSubject1) {
		this.examSubject1 = examSubject1;
	}
	public String getExamSubject2() {
		return examSubject2;
	}
	public void setExamSubject2(String examSubject2) {
		this.examSubject2 = examSubject2;
	}
	
	
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	
	
	  public Date getExamDate() { return examDate; } public void setExamDate(Date
	 examDate) { this.examDate = examDate; }
	 
	@Override
	public String toString() {
		return "ExamSchedule [examId=" + examId + ", examType=" + examType + ", examSubject1=" + examSubject1
				+ ", examSubject2=" + examSubject2 + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((examId == null) ? 0 : examId.hashCode());
		result = prime * result + ((examSubject1 == null) ? 0 : examSubject1.hashCode());
		result = prime * result + ((examSubject2 == null) ? 0 : examSubject2.hashCode());
		result = prime * result + ((examType == null) ? 0 : examType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamSchedule other = (ExamSchedule) obj;
		if (examId == null) {
			if (other.examId != null)
				return false;
		} else if (!examId.equals(other.examId))
			return false;
		if (examSubject1 == null) {
			if (other.examSubject1 != null)
				return false;
		} else if (!examSubject1.equals(other.examSubject1))
			return false;
		if (examSubject2 == null) {
			if (other.examSubject2 != null)
				return false;
		} else if (!examSubject2.equals(other.examSubject2))
			return false;
		if (examType == null) {
			if (other.examType != null)
				return false;
		} else if (!examType.equals(other.examType))
			return false;
		return true;
	}
	
	
}
