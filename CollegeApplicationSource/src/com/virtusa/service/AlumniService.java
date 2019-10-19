   package com.virtusa.service;

import java.util.List;

import com.virtusa.model.AlumniModel;

public interface AlumniService {



	public List<AlumniModel> retrieveAlumni();
	public String registerAlumni(AlumniModel model);
	public AlumniModel retrieveAlumniDetails(String firstName);

}