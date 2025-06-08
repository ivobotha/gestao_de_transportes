package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.Attendance;
import com.transporte.repositories.AttendanceRepository;

@Service
public class AttendanceService {
	@Autowired
	private AttendanceRepository repository;

	public List<Attendance> findAll() {
		return repository.findAll();
	}

	public Optional<Attendance> findById(Long id) {
		return repository.findById(id);
	}

	public Attendance save(Attendance attendance) {
		return repository.save(attendance);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}