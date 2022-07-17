package com.greatlearning.employeemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanager.entity.Employee;
import com.greatlearning.employeemanager.service.EmployeeUpdateServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeUpdateController {
	
	@Autowired
	private EmployeeUpdateServiceImpl employeeUpdateService;

	@PutMapping("/update/{id}")
	public void updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		employeeUpdateService.updateExistingEmployeeDetails(id, employee);
	}
	
}
