package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.TripHistory;
import com.transporte.repositories.TripHistoryRepository;

@Service
public class TripHistoryService {
	@Autowired
	private TripHistoryRepository repository;

	public List<TripHistory> findAll() {
		return repository.findAll();
	}

	public Optional<TripHistory> findById(Long id) {
		return repository.findById(id);
	}

	public TripHistory save(TripHistory trip) {
		return repository.save(trip);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
