package com.rest.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.dao.*;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> getEmployees(){
		return dao.findAll();
	}

	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		
		return dao.findById(id);
	}

	public Employee setEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	public void deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		dao.deleteById(empid);
	}

	public Employee updateById(String empid, Employee emp) {
		// TODO Auto-generated method stub
		Employee emp1 = dao.findById(empid).orElse(null);
		emp1.setFirstName(emp.getFirstName());
		emp1.setLastName(emp.getLastName());
		emp1.setEmail(emp.getEmail());
		emp1.setId(empid);
		return dao.save(emp1);
	}

}
