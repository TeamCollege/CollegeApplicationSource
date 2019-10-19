package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Applicant;
import com.virtusa.model.ApplicantModel;

public interface ApplicantDAO 
{
	public boolean persistApplicant(Applicant applicant) throws ClassNotFoundException, SQLException;
	public List<Applicant> viewApplicants();	
	public ApplicantModel retrieveApplicant();
}
     