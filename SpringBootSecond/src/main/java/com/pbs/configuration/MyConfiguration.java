package com.pbs.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pbs.model.Address;
import com.pbs.model.Employee;

@Configuration
public class MyConfiguration {
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public Employee getEmployee1() {
		return new Employee("PBS",100,"SE",24, getAddress());
	}
	
	@Bean
	public Address getAddress() {
		return new Address("Karnataka","Bengaluru","561203");
	}
}
