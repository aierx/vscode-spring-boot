package com.example.agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	@Autowired
	Student student;

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("leiwenyong");
		System.out.println("leiwenyong");
		System.out.println("leiwenyong");
		System.out.println("leiwenyong");
		SpringApplication.run(App.class, args);
	}


}
