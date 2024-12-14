package com.pbs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.pbs.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
}
