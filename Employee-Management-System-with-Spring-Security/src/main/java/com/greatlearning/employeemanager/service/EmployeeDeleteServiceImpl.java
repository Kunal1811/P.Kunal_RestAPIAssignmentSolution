package com.greatlearning.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeDeleteServiceImpl {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void removingAnExistingEmployee(long empId) {
		if(employeeRepository.findById(empId).isPresent()) {
			employeeRepository.deleteById(empId);
		}
	}
}
