package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.RouteSchedule;
import com.transporte.repositories.RouteScheduleRepository;

@Service
public class RouteScheduleService {
	@Autowired
	private RouteScheduleRepository repository;

	public List<RouteSchedule> findAll() {
		return repository.findAll();
	}

	public Optional<RouteSchedule> findById(Long id) {
		return repository.findById(id);
	}

	public RouteSchedule save(RouteSchedule schedule) {
		return repository.save(schedule);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}