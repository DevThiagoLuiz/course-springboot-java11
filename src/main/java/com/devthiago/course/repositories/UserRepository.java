package com.devthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthiago.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
