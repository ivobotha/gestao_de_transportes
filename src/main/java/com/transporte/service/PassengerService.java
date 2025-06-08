package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.Passenger;
import com.transporte.repositories.PassengerRepository;

@Service
public class PassengerService {
	@Autowired
	private PassengerRepository repository;

	public List<Passenger> findAll() {
		return repository.findAll();
	}

	public Optional<Passenger> findById(Long id) {
		return repository.findById(id);
	}

	public Passenger save(Passenger passenger) {
		return repository.save(passenger);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
