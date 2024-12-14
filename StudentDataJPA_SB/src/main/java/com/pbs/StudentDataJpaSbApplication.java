package com.pbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pbs.model.Employee;
import com.pbs.service.EmployeeService;

@SpringBootApplication
public class StudentDataJpaSbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentDataJpaSbApplication.class, args);
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		Employee e = new Employee(1,"PBS",24,100,"SE");
		employeeService.addEmployee(e);
		Employee e1 = new Employee(2,"PBS",24,100,"SE");
		employeeService.addEmployee(e1);
		employeeService.deleteEmployee(1);
		employeeService.deleteEmployee(5);
	}

}
