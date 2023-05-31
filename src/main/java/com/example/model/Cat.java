package com.example.model;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Animals {

	@Override
	public String eating() {
		//System.out.println("I am non vegiterian");
		return "I am non vegiterian";
		
	}
	
	

}
