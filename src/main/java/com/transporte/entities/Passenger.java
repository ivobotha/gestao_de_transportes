package com.transporte.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Passenger extends User {
	private String category;

	@OneToMany(mappedBy = "passenger")
	private List<Attendance> attendanceList;

	public Passenger() {
		super();
	}

	public Passenger(Long id, String name, String email, String password, String category) {
		super(id, name, email, password, UserType.PASSENGER);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Attendance> getAttendanceList() {
		return attendanceList;
	}

	public void setAttendanceList(List<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}
}
