package com.rest.dao;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rest.model.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee,String>{
	
	public Optional<Employee> findById(String id);
	public void deleteById(String id);
}
