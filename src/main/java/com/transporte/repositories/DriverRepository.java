package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}
