package com.greatlearning.employeemanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanager.entity.Employee;
import com.greatlearning.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeReadServiceImpl {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> displayAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> displayEmployeeWithGivenId(long id) {
		return employeeRepository.findById(id);
	}
	
	public List<Employee> searchByFirstName(String firstName) {
		
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		
		ExampleMatcher exampleMatcher = ExampleMatcher
				.matching()
				.withMatcher(firstName, ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("employeeId","lastName","email");
		
		Example<Employee> example = Example.of(employee, exampleMatcher);
		
		return employeeRepository.findAll(example);
	}
	
	public List<Employee> customSortedByFirstName(Direction direction) {
		
		return employeeRepository.findAll(Sort.by(direction, "firstName"));
	}
	
	

}
