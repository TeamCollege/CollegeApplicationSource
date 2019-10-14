package com.virtusa.entities;

public class ClassSchedule {
	
	//from database
	
	private String Day;
	private String first_hour;
	private String second_hour;
	private String third_hour;
	private String fourth_hour;
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	public String getFirst_hour() {
		return first_hour;
	}
	public void setFirst_hour(String first_hour) {
		this.first_hour = first_hour;
	}
	public String getSecond_hour() {
		return second_hour;
	}
	public void setSecond_hour(String second_hour) {
		this.second_hour = second_hour;
	}
	public String getThird_hour() {
		return third_hour;
	}
	public void setThird_hour(String third_hour) {
		this.third_hour = third_hour;
	}
	public String getFourth_hour() {
		return fourth_hour;
	}
	public void setFourth_hour(String fourth_hour) {
		this.fourth_hour = fourth_hour;
	}
	@Override
	public String toString() {
		return "ClassSchedule [Day=" + Day + ", first_hour=" + first_hour + ", second_hour=" + second_hour
				+ ", third_hour=" + third_hour + ", fourth_hour=" + fourth_hour + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Day == null) ? 0 : Day.hashCode());
		result = prime * result + ((first_hour == null) ? 0 : first_hour.hashCode());
		result = prime * result + ((fourth_hour == null) ? 0 : fourth_hour.hashCode());
		result = prime * result + ((second_hour == null) ? 0 : second_hour.hashCode());
		result = prime * result + ((third_hour == null) ? 0 : third_hour.hashCode());
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
		if (first_hour == null) {
			if (other.first_hour != null)
				return false;
		} else if (!first_hour.equals(other.first_hour))
			return false;
		if (fourth_hour == null) {
			if (other.fourth_hour != null)
				return false;
		} else if (!fourth_hour.equals(other.fourth_hour))
			return false;
		if (second_hour == null) {
			if (other.second_hour != null)
				return false;
		} else if (!second_hour.equals(other.second_hour))
			return false;
		if (third_hour == null) {
			if (other.third_hour != null)
				return false;
		} else if (!third_hour.equals(other.third_hour))
			return false;
		return true;
	}
	
	
	
	
}
