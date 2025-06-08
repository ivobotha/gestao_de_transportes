package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.Driver;
import com.transporte.repositories.DriverRepository;

@Service
public class DriverService {
	@Autowired
	private DriverRepository repository;

	public List<Driver> findAll() {
		return repository.findAll();
	}

	public Optional<Driver> findById(Long id) {
		return repository.findById(id);
	}

	public Driver save(Driver driver) {
		return repository.save(driver);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
