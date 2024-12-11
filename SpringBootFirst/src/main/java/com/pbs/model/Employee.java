package com.pbs.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.pbs.laptops.Laptop;

@Component
@Scope("prototype")
public class Employee {
	private String name;
	private int age;
	private int salary;
	private String Designation;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("lenovoLaptop")
	private Laptop laptop;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee() {
		System.out.println("Employee object created");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", Designation=" + Designation
				+ ", address=" + address + ", laptop=" + laptop + "]";
	}
	
	
	
	
}
