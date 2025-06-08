package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.RouteSchedule;

public interface VehicleRepository extends JpaRepository<RouteSchedule, Long> {

}
