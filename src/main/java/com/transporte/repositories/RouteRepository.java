package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {

}
