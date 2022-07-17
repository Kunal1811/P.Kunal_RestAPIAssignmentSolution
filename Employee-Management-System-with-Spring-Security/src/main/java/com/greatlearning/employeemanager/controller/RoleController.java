package com.greatlearning.employeemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanager.entity.Role;
import com.greatlearning.employeemanager.service.RoleServiceImpl;

@RestController
@RequestMapping("/roles")
public class RoleController {
	
	@Autowired
	private RoleServiceImpl roleService;
	
	@PostMapping("/addRole")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}
}
