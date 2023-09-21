package com.sanmartindev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanmartindev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
