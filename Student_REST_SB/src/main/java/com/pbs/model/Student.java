package com.pbs.model;

public class Student {
	int roll;
	String name;
	int standard;
	String school;
	int percentage;
	
	public Student() {
	}
	public Student(int roll, String name, int standard, String school, int percentage) {
		this.roll = roll;
		this.name = name;
		this.standard = standard;
		this.school = school;
		this.percentage = percentage;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
}
