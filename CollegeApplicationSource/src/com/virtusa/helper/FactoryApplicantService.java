package com.virtusa.helper;

import com.virtusa.dao.ApplicantDAO;
import com.virtusa.dao.ApplicantDAOImpl;
import com.virtusa.service.ApplicantService;
import com.virtusa.service.ApplicantServiceImpl;

public class FactoryApplicantService {
	
	public static ApplicantService createApplicantService() {
		ApplicantService applicantService=new ApplicantServiceImpl();
		return applicantService;
	} 

}
      