package com.sanmartindev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanmartindev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
