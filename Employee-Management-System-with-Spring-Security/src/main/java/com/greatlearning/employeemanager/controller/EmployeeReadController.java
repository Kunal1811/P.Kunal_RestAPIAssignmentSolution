package com.greatlearning.employeemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanager.entity.Employee;
import com.greatlearning.employeemanager.service.EmployeeReadServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeReadController {
	
	@Autowired
	private EmployeeReadServiceImpl employeeReadService;
	
	
	@GetMapping("/list")
	public List<Employee> displayAllEmployees() {
		return employeeReadService.displayAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee displayEmployeeWithGivenId(@PathVariable long id) {
		if(employeeReadService.displayEmployeeWithGivenId(id).isPresent()) {
			return employeeReadService.displayEmployeeWithGivenId(id).get();
		}
		return null;
	}
	
	@GetMapping("/search")
	public List<Employee> displayEmployeeByFirstName(@RequestParam("firstName") String firstName) {
		return employeeReadService.searchByFirstName(firstName);
	}
	
	@GetMapping("/sortedByFirstName")
	public List<Employee> getEmployeesCustomSortedByFirstName(@RequestParam("direction") Direction direction) {
		return employeeReadService.customSortedByFirstName(direction);
	}

}
