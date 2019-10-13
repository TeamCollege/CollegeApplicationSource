package com.virtusa.service;

import java.util.List;

import com.virtusa.model.AlumniModel;

public interface AlumniService {


	public boolean storeAlumniService(AlumniModel alumnimodel);
	public List<AlumniModel> retrieveAlumniService();

  
}
