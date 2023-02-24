package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.ChildRepo;

@Service
public class ApiService {
	@Autowired
	ChildRepo repository;
	public String addChild(Child child) {
		repository.save(child);
		return "Added";
	}
	
	public List<Child> getChild(){
		return repository.findAll();
	}
	public List<Child> getChildSorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<Child> getChildWithPagination(int offset,int pagesize){
		Page<Child> page=repository.findAll(PageRequest.of(offset, pagesize));
		return page.getContent();
	}
	public List<Child> getChildWithPaginationAndSorting(int offset,int pagesize,String field){
		Pageable paging=PageRequest.of(offset,pagesize,Sort.by(field));
		Page<Child> page=repository.findAll(paging);
		return page.getContent();
	}
}
