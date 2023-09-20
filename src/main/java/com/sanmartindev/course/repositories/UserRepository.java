package com.sanmartindev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanmartindev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	 
}
