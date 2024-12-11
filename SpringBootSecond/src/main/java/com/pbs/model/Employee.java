package com.pbs.model;

public class Employee {
	private String name;
	private int salary;
	private String designation;
	private int age;
	private Address address;
	
	public Employee() {
		System.out.println("Employee constructor");
	}

	public Employee(String name, int salary, String designation, int age, Address address) {
		System.out.println("Employee constructor with parameters");
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + ", age=" + age
				+ ", address=" + address + "]";
	}
	
}
