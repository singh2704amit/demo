package com.example.service;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class PrototypeService {
	
//	private SingletonService singletonService;
	
	private String dateTime = LocalDateTime.now().toString();

	public String getMethod() {
		return dateTime;
	}


}
