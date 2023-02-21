package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	@Value("${greeting.message}")
	private String message;
	@RequestMapping("/message")
	public String handler() {
		return message;
	}
	
}
