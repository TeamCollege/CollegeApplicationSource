   package com.virtusa.model;

import com.virtusa.entities.ClassSchedule;

public class StudentModel extends ApplicantModel
{
	private int studentId;
	private String departmentName;
	//12.10.19
	private ClassScheduleModel classScheduleModel;
	
	public StudentModel() {}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	

//12.10.19

	public ClassScheduleModel getClassScheduleModel() {
		return classScheduleModel;
	}


	public  void setClassScheduleModel(ClassScheduleModel classScheduleModel) {
		this.classScheduleModel = classScheduleModel;
	}


	@Override
	public String toString() {
		return "StudentModel [studentId=" + studentId + ", departmentName=" + departmentName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + studentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentModel other = (StudentModel) obj;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}



	
	

}
