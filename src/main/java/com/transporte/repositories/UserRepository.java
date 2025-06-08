package com.transporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
