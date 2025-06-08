package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.MaintenanceAlert;

public interface MaintenanceAlertRepository extends JpaRepository<MaintenanceAlert, Long> {

}
