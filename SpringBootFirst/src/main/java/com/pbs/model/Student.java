package com.pbs.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int regNo;
	private String name;
	private int standard;
	
	public Student() {
		System.out.println("Student object created");
	}
	
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", standard=" + standard + "]";
	}

	
	
	
}
