package com.devthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthiago.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
