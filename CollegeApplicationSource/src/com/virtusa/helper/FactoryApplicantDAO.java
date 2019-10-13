package com.virtusa.helper;

import com.virtusa.dao.ApplicantDAO;
import com.virtusa.dao.ApplicantDAOImpl;

public class FactoryApplicantDAO {

	public static ApplicantDAO createApplicantDAO()
	 {
		ApplicantDAO applicantDAO=new ApplicantDAOImpl();
		return applicantDAO;
	} 
	
}
