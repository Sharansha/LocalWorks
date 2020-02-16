package com.voy.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.voy.service.repo.EmployeeEntity;
import com.voy.service.repo.EmployeeService;


@RestController
public class RequestController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(value="/user",produces = { "application/json" }, method = RequestMethod.GET)
	public List<EmployeeEntity> getRegistredData(){
		List<EmployeeEntity> newList = service.getAll();
		return newList;
		
	}
	
	@GetMapping("/test")
	public String demoMethod() {
		
		return "Success";
	}
	
}
