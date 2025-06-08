package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.TripHistory;

public interface TripHistoryRepository extends JpaRepository<TripHistory, Long> {

}
