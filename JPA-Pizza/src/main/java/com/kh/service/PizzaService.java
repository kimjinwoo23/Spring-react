package com.kh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.entity.Pizza;
import com.kh.repository.PizzaRepository;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepository pizzaRepository;
	
	
	public Pizza createPizza(Pizza p) {
		return pizzaRepository.save(p);
				
	}
	public List<Pizza> getAllPizza(){
		return pizzaRepository.findAll();
	}
	public List<Pizza> searchPizza(String query){
		return pizzaRepository.findByPizzaNamecontainingIgnoreCase(query);
	}
}


