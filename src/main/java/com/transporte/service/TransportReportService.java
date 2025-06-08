package com.transporte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.entities.TransportReport;
import com.transporte.repositories.TransportReportRepository;

@Service
public class TransportReportService {
	@Autowired
	private TransportReportRepository repository;

	public List<TransportReport> findAll() {
		return repository.findAll();
	}

	public Optional<TransportReport> findById(Long id) {
		return repository.findById(id);
	}

	public TransportReport save(TransportReport report) {
		return repository.save(report);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}