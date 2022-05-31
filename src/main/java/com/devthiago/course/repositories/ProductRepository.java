package com.devthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthiago.course.entities.Category;
import com.devthiago.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
