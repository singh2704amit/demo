package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Animals;

@RestController
@RequestMapping("/autowire")
public class AutowiredController {
	
	
	
	@Autowired
	public void setAnimals(@Qualifier("dog") Animals animals) {
		this.animals = animals;
	}
	//@Qualifier("cat")
	//@Autowired 
	private Animals animals;
	@GetMapping("/")
	public String fetchAnimalCharacteristics() {

		return animals.eating();

	}

}
