package com.devthiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthiago.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
