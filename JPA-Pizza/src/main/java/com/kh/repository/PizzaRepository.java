package com.kh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kh.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Integer>{
	
	List<Pizza> findByPizzaNamecontainingIgnoreCase(String query);
	
	
}
