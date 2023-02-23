package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService service;
	@PostMapping("/employee")
	public boolean addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return service.getEmployee();
	}
	@GetMapping("/employee{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return service.getEmployeeById(id);
	}
}
