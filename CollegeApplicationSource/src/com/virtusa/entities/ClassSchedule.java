package com.virtusa.entities;

public class ClassSchedule {
	
	//from database
	
	private String Day;
	private String firstHour;
	private String secondHour;
	private String thirdHour;
	private String fourthHour;
	public String getDay() {
		return Day;
	}    
	public void setDay(String day) {
		Day = day;
	}
	public String getFirstHour() {
		return firstHour;
	}
	public void setFirstHour(String firstHour) {
		this.firstHour = firstHour;
	}
	public String getSecondHour() {
		return secondHour;
	}
	public void setSecondHour(String secondHour) {
		this.secondHour = secondHour;
	}
	public String getThirdHour() {
		return thirdHour;
	}
	public void setThirdHour(String thirdHour) {
		this.thirdHour = thirdHour;
	}
	public String getFourthHour() {
		return fourthHour;
	}
	public void setFourthHour(String fourthHour) {
		this.fourthHour = fourthHour;
	}
	@Override
	public String toString() {
		return "ClassSchedule [Day=" + Day + ", firstHour=" + firstHour + ", secondHour=" + secondHour + ", thirdHour="
				+ thirdHour + ", fourthHour=" + fourthHour + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Day == null) ? 0 : Day.hashCode());
		result = prime * result + ((firstHour == null) ? 0 : firstHour.hashCode());
		result = prime * result + ((fourthHour == null) ? 0 : fourthHour.hashCode());
		result = prime * result + ((secondHour == null) ? 0 : secondHour.hashCode());
		result = prime * result + ((thirdHour == null) ? 0 : thirdHour.hashCode());
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
		ClassSchedule other = (ClassSchedule) obj;
		if (Day == null) {
			if (other.Day != null)
				return false;
		} else if (!Day.equals(other.Day))
			return false;
		if (firstHour == null) {
			if (other.firstHour != null)
				return false;
		} else if (!firstHour.equals(other.firstHour))
			return false;
		if (fourthHour == null) {
			if (other.fourthHour != null)
				return false;
		} else if (!fourthHour.equals(other.fourthHour))
			return false;
		if (secondHour == null) {
			if (other.secondHour != null)
				return false;
		} else if (!secondHour.equals(other.secondHour))
			return false;
		if (thirdHour == null) {
			if (other.thirdHour != null)
				return false;
		} else if (!thirdHour.equals(other.thirdHour))
			return false;
		return true;
	}
	
	
	
}
