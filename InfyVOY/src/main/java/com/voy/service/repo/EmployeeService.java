package com.voy.service.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voy.service.dao.UserRepository;

@Service
public class EmployeeService {
	
	@Autowired
	UserRepository userRepository;


	

	public List<EmployeeEntity> getAll() {
		 List<EmployeeEntity> employeeDetail = userRepository.findAll();
		return employeeDetail;
	}

}
