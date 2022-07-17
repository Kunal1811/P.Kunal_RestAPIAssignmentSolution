package com.greatlearning.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanager.entity.Role;
import com.greatlearning.employeemanager.repository.RoleRepository;

@Service
public class RoleServiceImpl {

	@Autowired
	private RoleRepository roleRepository;
	
	public void addRole(Role role) {
		roleRepository.save(role);
	}
}
