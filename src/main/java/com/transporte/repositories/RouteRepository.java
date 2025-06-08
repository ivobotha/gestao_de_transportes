package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.Vehicle;

public interface RouteRepository extends JpaRepository<Vehicle, Long> {

}
