package com.virtusa.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.ClassSchedule;
import com.virtusa.entities.Faculty;
import com.virtusa.entities.StaffMeeting;
import com.virtusa.entities.Student;
import com.virtusa.entities.UploadDownloadAssignments;
import com.virtusa.integrate.ConnectionManager;
 
public class FacultyDAOImpl implements FacultyDAO {
	
	public List<ClassSchedule> viewCLassSchedule(String departmentName) throws ClassNotFoundException, SQLException{
		
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet = null;
		switch(departmentName) {
		case "cse":
			resultSet = statement.executeQuery("select * from cse_schedule");
			break;
		case "ece":
			resultSet = statement.executeQuery("select * from ece_schedule");
			break;
		case "eee":
			resultSet = statement.executeQuery("select * from eee_schedule");
			break;
		}
		
		List<ClassSchedule> classScheduleList = new ArrayList<ClassSchedule>();
		while(resultSet.next()) {
			ClassSchedule classSchedule = new ClassSchedule();
			classSchedule.setDay(resultSet.getString("day"));
			classSchedule.setFirstHour(resultSet.getString("first_hour"));
			classSchedule.setSecondHour(resultSet.getString("second_hour"));
			classSchedule.setThirdHour(resultSet.getString("third_hour"));
			classSchedule.setFourthHour(resultSet.getString("fourth_hour"));
			classScheduleList.add(classSchedule);
		}
		ConnectionManager.closeConnection();
		return classScheduleList;
	}

	@Override
	public Faculty getStaffMeetingDetails(String facultyId) throws ClassNotFoundException, SQLException {
		
		Connection connection=ConnectionManager.openConnection(); 
		PreparedStatement statement=connection.prepareStatement("select * from staff_meeting_details where faculty_Id=?");
		statement.setString(1, facultyId);
		ResultSet resultSet=statement.executeQuery();
		Faculty faculty = new Faculty();
		while(resultSet.next()) {
			StaffMeeting staffMeeting = new StaffMeeting();
			//staffMeeting.setFacultyId(resultSet.getString("faculty_id"));
			staffMeeting.setStaffMeetingId(resultSet.getInt("staff_meeting_id"));
			staffMeeting.setStaffMeetingAgenda(resultSet.getString("staff_meeting_agenda"));
			staffMeeting.setLocation(resultSet.getString("location"));
			
			faculty.setStaffMeeting(staffMeeting);
		}
		
		ConnectionManager.closeConnection();
		return faculty;
	}

	@Override
	public boolean uploadDownloadAssignments(UploadDownloadAssignments uploadDownloadAssignments) throws SQLException, ClassNotFoundException, FileNotFoundException {
		File file=new File(uploadDownloadAssignments.getPath());
		//System.out.println(file);
		Reader reader=new FileReader(file);
		//System.out.println(reader);
		Connection connection=ConnectionManager.openConnection(); 
		PreparedStatement statement=
				connection.prepareStatement("insert into filetable values(?,?,?)");
		statement.setInt(1, uploadDownloadAssignments.getFileId());
		statement.setString(2, uploadDownloadAssignments.getFileName());
		statement.setCharacterStream(3, reader);
		ConnectionManager.closeConnection();
		int rows=statement.executeUpdate();
		//System.out.println("in dao");
		if(rows>0)
			return true;
		else
			return false;
	}
}


