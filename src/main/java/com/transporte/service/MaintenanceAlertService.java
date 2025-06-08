package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.MaintenanceAlert;
import com.transporte.repositories.MaintenanceAlertRepository;

@Service
public class MaintenanceAlertService {
	@Autowired
	private MaintenanceAlertRepository repository;

	public List<MaintenanceAlert> findAll() {
		return repository.findAll();
	}

	public Optional<MaintenanceAlert> findById(Long id) {
		return repository.findById(id);
	}

	public MaintenanceAlert save(MaintenanceAlert alert) {
		return repository.save(alert);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
