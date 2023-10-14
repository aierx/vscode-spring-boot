package com.example.agent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelleController{
	@GetMapping("/hello")
	public String getHello(){
		System.out.println("lkewenadada");
		return "5555555555555555";
	}
}