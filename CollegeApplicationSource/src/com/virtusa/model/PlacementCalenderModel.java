package com.virtusa.model;

import java.util.Date;

public class PlacementCalenderModel {

	
	private int placementId;
	private String comapanyName;
	private String location;
	private String eligibilityCriteria;
	private Date date;
	public int getPlacementId() {
		return placementId;
	}
	public void setPlacementId(int placementId) {
		this.placementId = placementId;
	}
	public String getComapanyName() {
		return comapanyName;
	}
	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}
	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "PlacementCalenderModel [placementId=" + placementId + ", comapanyName=" + comapanyName + ", location="
				+ location + ", eligibilityCriteria=" + eligibilityCriteria + ", date=" + date + "]";
	}
	
	
	
}
