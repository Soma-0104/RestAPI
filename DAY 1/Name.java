package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	
	private String Studentname="IamNeo";
	@GetMapping("/display")
	public String display() {
		return "Welcome "+Studentname+"!";
	}
}
