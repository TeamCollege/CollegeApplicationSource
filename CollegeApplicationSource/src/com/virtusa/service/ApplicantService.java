package com.virtusa.service;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.ApplicantModel;


public interface ApplicantService 
{

	public String storeApplicantService(ApplicantModel applicantModel);
	public List<ApplicantModel> retrieveApplicants();
}
    