package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.Vehicle;
import com.transporte.repositories.VehicleRepository;

@Service
public class VehicleService {
	@Autowired
	private VehicleRepository repository;

	public List<Vehicle> findAll() {
		return repository.findAll();
	}

	public Optional<Vehicle> findById(Long id) {
		return repository.findById(id);
	}

	public Vehicle save(Vehicle vehicle) {
		return repository.save(vehicle);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
