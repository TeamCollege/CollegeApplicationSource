package com.virtusa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Applicant;
import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.ApplicantModel;

public class ApplicantDAOImpl implements ApplicantDAO
{

	@Override
	public boolean persistApplicant(Applicant applicant) throws ClassNotFoundException, SQLException  {
		
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		    
		Connection conn=ConnectionManager.openConnection();
		PreparedStatement preparedStatement = conn.prepareStatement("insert into application_form values(?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1,applicant.getApplicantNumber());
		preparedStatement.setString(2, applicant.getFirstName());
		preparedStatement.setString(3, applicant.getLastName());
		preparedStatement.setString(4, applicant.getEmailAddress());
		preparedStatement.setString(5, applicant.getPhoneNumber());
		preparedStatement.setDouble(6, applicant.getTenthPercentage());
		preparedStatement.setDouble(7, applicant.getInterPercentage());
		preparedStatement.setString(8, applicant.getAadharNumber());
		preparedStatement.setDate(9, Date.valueOf(applicant.getDateOfBirth()));
		
		//preparedStatement.setString(10, applicant.getCourseName());
		preparedStatement.setString(10, applicant.getDepartmentName());
		int rows=preparedStatement.executeUpdate();
		ConnectionManager.closeConnection();
		
		if(rows>0)
			return true;
		else
			return false;
	}

	@Override
	public List<Applicant> viewApplicants() {
		return ApplicantRepository.get();
	}

	@Override
	public ApplicantModel retrieveApplicant()
	{
		/*
		 * retrieve single applicant
		 */
		
		ApplicantModel applicantModel = new ApplicantModel();
		applicantModel.getTenthPercentage();
		applicantModel.getInterPercentage();
		return applicantModel;
		
	}
	
}
