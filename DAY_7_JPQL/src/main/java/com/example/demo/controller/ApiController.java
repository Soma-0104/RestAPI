package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@RestController
public class ApiController {
	@Autowired
	CarRepo repository;
	@PostMapping("/car")
	public boolean addCar(@RequestBody Car car) {
		repository.save(car);
		return true;
	}
	@GetMapping("/owners/{owners}")
	public List<Car> getCarByOwners(@PathVariable int owners){
		return repository.findByOwners(owners);
	}
	@GetMapping("/address/{address}")
	public List<Car> getCarByAddress(@PathVariable String address){
		return repository.findByAddress(address);
	}
	@GetMapping("/carname/{carName}")
	public List<Car> getCarByName(@PathVariable String carName){
		return repository.findByCarName(carName);
	}
	@GetMapping("/owners/{owners}/{carType}")
	public List<Car> getByOwnerAndType(@PathVariable int owners,@PathVariable String carType){
		return repository.findByOwnersAndCarType(owners,carType);
	}
}
