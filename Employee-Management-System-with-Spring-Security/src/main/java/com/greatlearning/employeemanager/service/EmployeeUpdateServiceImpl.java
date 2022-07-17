package com.greatlearning.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanager.entity.Employee;
import com.greatlearning.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeUpdateServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void updateExistingEmployeeDetails(long id, Employee employee) {
		if(employeeRepository.findById(id).isPresent()) {
			Employee newEmployee =  employeeRepository.findById(id).get();
			
			newEmployee.setFirstName(employee.getFirstName());
			newEmployee.setLastName(employee.getLastName());
			newEmployee.setEmail(employee.getEmail());
			
			employeeRepository.save(newEmployee);
		}
	}
}
