package com.virtusa.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.FacultyDAO;
import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Faculty;
import com.virtusa.entities.StaffMeeting;
import com.virtusa.entities.Student;
import com.virtusa.entities.UploadDownloadAssignments;
import com.virtusa.helper.FactoryFacultyDAO;
import com.virtusa.model.ClassScheduleModel;
import com.virtusa.model.FacultyModel;
import com.virtusa.model.StaffMeetingModel;
import com.virtusa.model.StudentModel;

public class FacultyServiceImpl implements FacultyService {
	
	private FacultyDAO facultyDAO=null;
	public FacultyServiceImpl() {
		this.facultyDAO=FactoryFacultyDAO.createFacultyDAO();
	}
 
	@Override
	public List<ClassScheduleModel> retreiveClassSchedule(String departmentName) {
		List<ClassScheduleModel> classScheduleModelList = new ArrayList<>();
			try {
				List<ClassSchedule> classScheduleList = facultyDAO.viewCLassSchedule(departmentName);
				for(ClassSchedule classSchedule:classScheduleList) {
					ClassScheduleModel classScheduleModel = new ClassScheduleModel();
					classScheduleModel.setDay(classSchedule.getDay());
					classScheduleModel.setFirstHour(classSchedule.getFirstHour());
					classScheduleModel.setSecondHour(classSchedule.getSecondHour());
					classScheduleModel.setThirdHour(classSchedule.getThirdHour());
					classScheduleModel.setFourthHour(classSchedule.getFourthHour());
					classScheduleModelList.add(classScheduleModel);
					System.out.println("sda");
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	
		return classScheduleModelList;
	}

	@Override
	public FacultyModel handleRetrieveStaffMeeting(String facultyId) {
		Faculty faculty=null;
		FacultyModel facultyModel=new FacultyModel();
		try {
			faculty = facultyDAO.getStaffMeetingDetails(facultyId);
			StaffMeeting staffMeeting=faculty.getStaffMeeting();
			StaffMeetingModel staffMeetingModel=new StaffMeetingModel();
			
			staffMeetingModel.setFacultyId(facultyId);
			staffMeetingModel.setStaffMeetingId(staffMeeting.getStaffMeetingId());
			staffMeetingModel.setStaffMeetingAgenda(staffMeeting.getStaffMeetingAgenda());
			staffMeetingModel.setLocation(staffMeeting.getLocation());
			
			facultyModel.setStaffMeetingModel(staffMeetingModel);
		}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}		
		return facultyModel;
	}

	@Override
	public String uploadAssignments(String fileName, String path) {
		File file=new File(path);
		//UploadDownloadAssignments uploadDownloadAssignments=null;
		String result = "failed";
		try{
			System.out.println("helloservice");
			boolean stored = facultyDAO.uploadDownloadAssignments(path, file, fileName);
			if(stored)
				result = "success";
		}
		catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("!ERROR[Registration failed due to some internal issue]");
		}
		
		return result;
		}
		
	}


