package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.model.*;
import java.util.*;

@CrossOrigin//(origins = "http://localhost:8081")
@RestController()
@RequestMapping("/home")
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/greet")
	public String greetings() {
		return "hello welcome";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable String id) {
//		int empid = Integer.parseInt(id);
		return service.getEmployeeById(id);
		
	}
	
	@PostMapping("/employees")
	public Employee setEmployee(@RequestBody Employee emp) {
		return service.setEmployee(emp);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable String id) {
//		int empid = Integer.parseInt(id);
		service.deleteEmployee(id);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateById(@PathVariable String id,@RequestBody Employee emp) {
//		int empid = Integer.parseInt(id);
//		Employee emp = 
		return service.updateById(id,emp);
	}
	
	
	
	
}
