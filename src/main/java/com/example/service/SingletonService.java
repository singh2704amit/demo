package com.example.service;

import java.time.LocalDateTime;

import javax.naming.spi.ObjectFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {

	// @Autowired
	// PrototypeService prototypeService;

	@Autowired
	private org.springframework.beans.factory.ObjectFactory<PrototypeService> prototypeServiceProvider;

	// private String dateTime = LocalDateTime.now().toString();

	public String getMethod() {
		return prototypeServiceProvider.getObject().getMethod();
	}

}
