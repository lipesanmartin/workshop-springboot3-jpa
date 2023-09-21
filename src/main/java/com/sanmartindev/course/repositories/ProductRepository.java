package com.sanmartindev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanmartindev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
