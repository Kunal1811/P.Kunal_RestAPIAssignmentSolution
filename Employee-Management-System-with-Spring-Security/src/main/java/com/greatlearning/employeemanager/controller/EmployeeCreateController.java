package com.greatlearning.employeemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanager.entity.Employee;
import com.greatlearning.employeemanager.service.EmployeeCreateServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeCreateController {
	
	@Autowired
	private EmployeeCreateServiceImpl employeeCreateService;
	
	@PostMapping("/register")
	public void registerNewEmployee(@RequestBody Employee employee) {
		employeeCreateService.registerAnEmployee(employee);
	}

}
