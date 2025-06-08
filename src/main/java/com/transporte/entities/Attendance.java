package com.transporte.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;

	@ManyToOne
	private Passenger passenger;

	@ManyToOne
	private RouteSchedule schedule;

	public Attendance() {
	}

	public Attendance(Long id, String status, Passenger passenger, RouteSchedule schedule) {
		this.id = id;
		this.status = status;
		this.passenger = passenger;
		this.schedule = schedule;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public RouteSchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(RouteSchedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Attendance))
			return false;
		Attendance that = (Attendance) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
