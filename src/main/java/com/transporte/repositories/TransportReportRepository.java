package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.TransportReport;

public interface TransportReportRepository extends JpaRepository<TransportReport, Long> {

}
