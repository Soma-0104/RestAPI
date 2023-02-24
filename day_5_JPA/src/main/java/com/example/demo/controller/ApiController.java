package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService service ;
	@PostMapping("/book")		
	public boolean add(@RequestBody Book book) {
	return service.addBook(book);
	}
	@GetMapping("/book")
	public List<Book> get(){
	return service.getBook();
	}
	@GetMapping("/student/{id}")
	public Optional<Book> getBookById(@PathVariable int id){
	return service.getBookById(id);
	}
	@PutMapping("/book/{id}")
	public Book update(@RequestBody Book book) {
	return service.updateBook(book);
	}
	@DeleteMapping("/book/{id}")
	public boolean delete(@RequestParam int id) {
	return service.deleteById(id);
	}
}
