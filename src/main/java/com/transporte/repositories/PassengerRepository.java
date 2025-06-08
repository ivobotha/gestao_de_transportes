package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
