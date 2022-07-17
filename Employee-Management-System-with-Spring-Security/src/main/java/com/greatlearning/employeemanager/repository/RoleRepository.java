package com.greatlearning.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeemanager.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
