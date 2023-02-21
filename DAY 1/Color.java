package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String favColor="Blue";
	@GetMapping("/color")
	public String color() {
		return "My Favourite colour is "+favColor;
	}
}
