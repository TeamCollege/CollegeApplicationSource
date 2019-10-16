package com.virtusa.model;

import com.virtusa.entities.StaffMeeting;

public class StaffMeetingModel {

	private int staffMeetingId;
	private String staffMeetingAgenda;
	private String facultyId;
	private String location;
	public int getStaffMeetingId() {
		return staffMeetingId;
	}
	public void setStaffMeetingId(int staffMeetingId) {
		this.staffMeetingId = staffMeetingId;
	}
	public String getStaffMeetingAgenda() {
		return staffMeetingAgenda;
	}
	public void setStaffMeetingAgenda(String staffMeetingAgenda) {
		this.staffMeetingAgenda = staffMeetingAgenda;
	}
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "StaffMeetingModel [staffMeetingId=" + staffMeetingId + ", staffMeetingAgenda=" + staffMeetingAgenda
				+ ", facultyId=" + facultyId + ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultyId == null) ? 0 : facultyId.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((staffMeetingAgenda == null) ? 0 : staffMeetingAgenda.hashCode());
		result = prime * result + staffMeetingId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StaffMeetingModel other = (StaffMeetingModel) obj;
		if (facultyId == null) {
			if (other.facultyId != null)
				return false;
		} else if (!facultyId.equals(other.facultyId))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (staffMeetingAgenda == null) {
			if (other.staffMeetingAgenda != null)
				return false;
		} else if (!staffMeetingAgenda.equals(other.staffMeetingAgenda))
			return false;
		if (staffMeetingId != other.staffMeetingId)
			return false;
		return true;
	}
	
}
