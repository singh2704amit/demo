package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Student;

//@Configuration
public class DemoConfiguration {

	//@Lazy
	@Bean(name = "student1")
	Student getStudent1() {
		System.out.println("I am bean and inside config calss for student1");
		return new Student();
	}
	//@Lazy
	@Bean(name = "student2")
	Student getStudent2() {
		System.out.println("I am bean and inside config calss for studebt 2");
		return new Student();
	}

}
