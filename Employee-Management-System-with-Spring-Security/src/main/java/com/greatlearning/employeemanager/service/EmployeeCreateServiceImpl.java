package com.greatlearning.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanager.entity.Employee;
import com.greatlearning.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeCreateServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void registerAnEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
}
