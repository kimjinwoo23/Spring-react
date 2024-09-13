package com.kh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.dto.BCUser;

public interface BCUserRepository extends JpaRepository<BCUser,Integer>{
	
	//BCUser saveUser();
	
	BCUser findByEmail(String email);
}
