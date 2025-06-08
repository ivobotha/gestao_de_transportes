package com.transporte.entities;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String plate;
	private String model;
	private int capacity;
	private boolean underMaintenance;

	@OneToMany(mappedBy = "vehicle")
	private List<RouteSchedule> schedules;

	public Vehicle() {
	}

	public Vehicle(Long id, String plate, String model, int capacity, boolean underMaintenance) {
		this.id = id;
		this.plate = plate;
		this.model = model;
		this.capacity = capacity;
		this.underMaintenance = underMaintenance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isUnderMaintenance() {
		return underMaintenance;
	}

	public void setUnderMaintenance(boolean underMaintenance) {
		this.underMaintenance = underMaintenance;
	}

	public List<RouteSchedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<RouteSchedule> schedules) {
		this.schedules = schedules;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Vehicle))
			return false;
		Vehicle vehicle = (Vehicle) o;
		return Objects.equals(id, vehicle.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
