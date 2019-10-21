package com.virtusa.service;


import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.StudentDAO;
import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.ExamSchedule;
import com.virtusa.entities.PlacementCalender;
import com.virtusa.entities.Results;
import com.virtusa.entities.Student;
import com.virtusa.entities.UploadDownloadAssignments;
import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.ExamScheduleModel;
import com.virtusa.model.PlacementCalenderModel;
import com.virtusa.model.ResultsModel;
import com.virtusa.model.StudentModel;
import com.virtusa.model.UploadDownloadAssignmentsModel;
import com.virtusa.model.StudentModel;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;
	public StudentServiceImpl() {
		this.studentDAO=FactoryStudentDAO.createStudentDAO();
	}
//12.10.19
	@Override
	public StudentModel handleRetrieveClassSchedule(String departmentName) {
		Student students=null;
		StudentModel studentModel=new StudentModel();       
		try {
		students=studentDAO.getClassSchedule(departmentName);
		ClassSchedule classSchedule=students.getClassSchedule();
		ClassScheduleModel classScheduleModel=new ClassScheduleModel();
		classScheduleModel.setDay(classSchedule.getDay());
		classScheduleModel.setFirstHour(classSchedule.getFirstHour());
		classScheduleModel.setSecondHour(classSchedule.getSecondHour());
		classScheduleModel.setThirdHour(classSchedule.getThirdHour());
		classScheduleModel.setFourthHour(classSchedule.getFourthHour());
	
		studentModel.setClassScheduleModel(classScheduleModel);
	
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
	return studentModel;
	}
	
	@Override
	public StudentModel handleRetrieveExamintionSchedule(String departmentName) {
		// TODO Auto-generated method stub
		Student students=null;
		StudentModel studentModel=new StudentModel();
		try {
		students=studentDAO.getExaminationSchedule(departmentName);
		ExamSchedule examSchedule=students.getExamSchedule();
		ExamScheduleModel examScheduleModel=new ExamScheduleModel();
		examScheduleModel.setExamId(examSchedule.getExamId());
		examScheduleModel.setExamType(examSchedule.getExamType());
		examScheduleModel.setExamName(examSchedule.getExamName());
		examScheduleModel.setExamDate(examSchedule.getExamDate());
		examScheduleModel.setExamSubject1(examSchedule.getExamSubject1());
		examScheduleModel.setExamSubject2(examSchedule.getExamSubject2());
	
		studentModel.setExamScheduleModel(examScheduleModel);
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
		return studentModel;
}
	
	@Override
	public StudentModel handleRetrieveResults(int studentId) {
		// TODO Auto-generated method stub
		Student students=null;
		StudentModel studentModel=new StudentModel();
		try {
		students=studentDAO.getResults(studentId);
		Results results=students.getResults();
		ResultsModel resultsModel=new ResultsModel();
		resultsModel.setStudentId(results.getStudentId());
		resultsModel.setSubject1Name(results.getSubject1Name());
		resultsModel.setSubject1Marks(results.getSubject1Marks());
		resultsModel.setSubject2Marks(results.getSubject2Marks());
		resultsModel.setSubject2Name(results.getSubject2Name());
		resultsModel.setFinalresult(results.getFinalresult());
		
		studentModel.setResultsModel(resultsModel);
		
		
	}catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
		return studentModel;
}
	
	@Override
	public StudentModel handleRetrievePlacementCalender() {
		// TODO Auto-generated method stub
		Student students=null;
		StudentModel studentModel=new StudentModel();
		try {
		students=studentDAO.getPlacementCalender();
		PlacementCalender placementCalender=students.getPlacementCalender();
		PlacementCalenderModel placementCalenderModel=new PlacementCalenderModel();
		System.out.println("jdb");
		placementCalenderModel.setComapanyName(placementCalender.getComapanyName());
		placementCalenderModel.setDate(placementCalender.getDate());
		placementCalenderModel.setLocation(placementCalender.getLocation());
		placementCalenderModel.setEligibilityCriteria(placementCalender.getEligibilityCriteria());
		System.out.println(placementCalender.getEligibilityCriteria());
	}catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
		System.out.println("coming");
		return studentModel;
}
	
	
	
/*	@Override
	public String handleUploadAssignments(String path) {
		// TODO Auto-generated method stub
		UploadDownloadAssignments uploadDownloadAssignments=null;
		UploadDownloadAssignmentsModel  uploadDownloadAssignmentsModel=new UploadDownloadAssignmentsModel();
		
		uploadDownloadAssignments.setFileId(uploadDownloadAssignmentsModel.getFileId());
		uploadDownloadAssignments.setFileName(uploadDownloadAssignmentsModel.getFileName());
		
		String result = "failed";
		try{
			System.out.println("helloservice");
			boolean stored = studentDAO.uploadDownloadAssignments(path);
			if(stored)
				result = "success";
		}
		catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("!ERROR[Upload failed due to some internal issue]");
		}
		
		return result;
		}*/
	@Override
	public String handleUploadAssignments(String path)  {
		// TODO Auto-generated method stub
		UploadDownloadAssignments uploadDownloadAssignments=new UploadDownloadAssignments(); ;
		UploadDownloadAssignmentsModel uploadDownloadAssignmentsModel=new UploadDownloadAssignmentsModel();
		uploadDownloadAssignmentsModel.setFileId(uploadDownloadAssignments.getFileId());
		uploadDownloadAssignmentsModel.setFileName(uploadDownloadAssignments.getFileName());
		uploadDownloadAssignmentsModel.setPath(uploadDownloadAssignments.getPath());
		uploadDownloadAssignmentsModel.setFileDescription(uploadDownloadAssignments.getFileDescription());
		System.out.println("going service?");
		
		String result = "failed";
		try{
			System.out.println("helloservice");
			boolean stored = studentDAO.handleRetrieveUploadAssignments(path);
			System.out.println("after");
			if(stored)
				result = "success";
		}
		catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("!ERROR[Upload failed due to some internal issue]");
		}
		
		return result;
	}
	}

	


