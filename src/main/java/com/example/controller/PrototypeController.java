package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PrototypeService;
import com.example.service.SingletonService;

//@RequestMapping("/example")
@RestController
public class PrototypeController {

	@Autowired
	private SingletonService singletonService;

	@Autowired
	PrototypeService prototypeService;

	@GetMapping("v1/example")
	public List<String> getMethod() throws InterruptedException {
		String first = singletonService.getMethod();
		Thread.sleep(1000);

		String second = singletonService.getMethod();

		return Arrays.asList(first, second);
	}

}
