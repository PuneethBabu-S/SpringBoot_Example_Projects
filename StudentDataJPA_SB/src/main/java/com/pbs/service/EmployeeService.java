package com.pbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.model.Employee;
import com.pbs.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public void addEmployee(Employee e) {
		employeeRepo.save(e);
	}
	
	public void deleteEmployee(int id) {
		if(employeeRepo.existsById(id)) employeeRepo.deleteById(id);
		else System.out.println("Invalid employee id");
	}
}
