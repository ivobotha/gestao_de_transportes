package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.Route;
import com.transporte.repositories.RouteRepository;

@Service
public class RouteService {
	@Autowired
	private RouteRepository repository;

	public List<Route> findAll() {
		return repository.findAll();
	}

	public Optional<Route> findById(Long id) {
		return repository.findById(id);
	}

	public Route save(Route route) {
		return repository.save(route);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
