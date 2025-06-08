package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
