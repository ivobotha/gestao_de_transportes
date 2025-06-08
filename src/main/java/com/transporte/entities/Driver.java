package com.transporte.entities;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Driver extends User {
	private String licenseNumber;

	@OneToMany(mappedBy = "driver")
	private List<RouteSchedule> schedules;

	public Driver() {
		super();
	}

	public Driver(Long id, String name, String email, String password, String licenseNumber) {
		super(id, name, email, password, UserType.DRIVER);
		this.licenseNumber = licenseNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public List<RouteSchedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<RouteSchedule> schedules) {
		this.schedules = schedules;
	}
}
