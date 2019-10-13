package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Alumni;

public class AlumniDAOImpl implements AlumniDAO {
	  

	@Override
	public List<Alumni> viewAlumni() {
		// TODO Auto-generated method stub
		return AlumniRepository.get();
	}

	@Override
	public boolean persistStudent(Alumni alumni) {
		// TODO Auto-generated method stub
		 return AlumniRepository.add(alumni);
	}

	

	
	

}
