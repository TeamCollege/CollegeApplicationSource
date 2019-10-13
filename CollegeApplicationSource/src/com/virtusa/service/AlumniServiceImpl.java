package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.AlumniDAO;
import com.virtusa.entities.Alumni;
import com.virtusa.helper.FactoryAlumniDAO;
import com.virtusa.model.AlumniModel;

public class AlumniServiceImpl implements AlumniService {
	
	private AlumniDAO alumniDAO=null;
	public AlumniServiceImpl(){
		this.alumniDAO=FactoryAlumniDAO.createAlumniDAO();
		

	 

}
	@Override
	public boolean storeAlumniService(AlumniModel alumnimodel) {
		// TODO Auto-generated method stub
		
		Alumni alumni=new Alumni();
		alumni.setAlumniId(alumnimodel.getAlumniId());
		alumni.setFirstName(alumnimodel.getFirstName());
		alumni.setLastName(alumnimodel.getLastName());
		alumni.setDateOfBirth(alumnimodel.getDateOfBirth());
		alumni.setEmail(alumnimodel.getEmail());
		alumni.setPhoneNumber(alumnimodel.getPhoneNumber());
		alumni.setGender(alumnimodel.getGender());
		alumni.setCourseId(alumnimodel.getCourseId());
		alumni.setYearOfCompletition(alumnimodel.getYearOfCompletition());
	    alumni.setPresentStatus(alumnimodel.getPresentStatus());
	    
	    
		return alumniDAO.persistStudent(alumni);
		
	}
	@Override
	public List<AlumniModel> retrieveAlumniService() {
		// TODO Auto-generated method stub
	List<Alumni> alumniList=alumniDAO.viewAlumni();
		
		List<AlumniModel> alumniModelList=new ArrayList<AlumniModel>();
		
		for(Alumni alumni:alumniList){
			
			AlumniModel alumniMdl=new AlumniModel();
			alumniMdl.setAlumniId(alumni.getAlumniId());
			alumniMdl.setCourseId(alumni.getCourseId());
			alumniMdl.setFirstName(alumni.getFirstName());
			alumniMdl.setLastName(alumni.getLastName());
			alumniMdl.setEmail(alumni.getEmail());
			alumniMdl.setDateOfBirth(alumni.getDateOfBirth());
			alumniMdl.setGender(alumni.getGender());
			alumniMdl.setYearOfCompletition(alumni.getYearOfCompletition());
			alumniModelList.add(alumniMdl);
		}
		return alumniModelList;
	}


}
