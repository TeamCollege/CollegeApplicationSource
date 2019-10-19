package com.virtusa.service;


import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.StudentDAO;
import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Student;
import com.virtusa.entities.UploadDownloadAssignments;
import com.virtusa.helper.FactoryStudentDAO;
import com.virtusa.model.ClassScheduleModel;
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
	public String handleUploadAssignments(UploadDownloadAssignmentsModel uploadDownloadAssignmentsModel) {
		// TODO Auto-generated method stub
		
		UploadDownloadAssignments uploadDownloadAssignments=new UploadDownloadAssignments(); ;
		
		uploadDownloadAssignments.setFileId(uploadDownloadAssignmentsModel.getFileId());
		uploadDownloadAssignments.setFileName(uploadDownloadAssignmentsModel.getFileName());
		uploadDownloadAssignments.setPath(uploadDownloadAssignmentsModel.getPath());
		uploadDownloadAssignments.setFileDescription(uploadDownloadAssignmentsModel.getFileDescription());
		
		
		String result = "failed";
		try{
			System.out.println("helloservice");
			boolean stored = studentDAO.handleuploadDownloadAssignments(uploadDownloadAssignments);
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
	
	


