package com.example.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class Dog implements Animals {

	
	@Override
	public String eating() {
		// System.out.println("I am vegiterian");
		return "I am vegiterian";

	}

}
