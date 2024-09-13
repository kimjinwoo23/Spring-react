package com.kh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.entity.Pizza;
import com.kh.service.PizzaService;

@RestController
@RequestMapping("api/pizza")
public class PizzaController {

	@Autowired
	PizzaService pizzaService;
	
	@GetMapping
	public List<Pizza> getAllPizza(){
		return pizzaService.getAllPizza();
	}
	@PostMapping
	public Pizza savePizza(@RequestBody Pizza p) {
		return pizzaService.createPizza(p);
	}
	@GetMapping("/search")
	public List<Pizza> searchPizza(@RequestParam("query")String query){
		return pizzaService.searchPizza(query);
	}
}
