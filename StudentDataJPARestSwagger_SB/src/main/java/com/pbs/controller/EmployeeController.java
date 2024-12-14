package com.pbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pbs.model.Employee;
import com.pbs.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@PostMapping("/employee")
	public String createEmployee(@RequestBody Employee e) {
		if(employeeRepo.existsById(e.getEid())) return "Employee already presnt";
		employeeRepo.save(e); return "Created employee";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeRepo.findAll();
	}
	
	@GetMapping("/employee")
	public Optional<Employee> getEmployee(@RequestParam int id){
		return employeeRepo.findById(id);
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee e) {
		if(!employeeRepo.existsById(e.getEid())) return "No such employee";
		employeeRepo.save(e);
		return "Updated successfully";
	}
}
