package com.pbs.model;

public class Course {
	private int id;
	private String name;
	private double durationInHours;
	private double fee;
	
	public Course() {
	}
	
	public Course(int id, String name, double durationInHours, double fee) {
		this.id = id;
		this.name = name;
		this.durationInHours = durationInHours;
		this.fee = fee;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(double durationInHours) {
		this.durationInHours = durationInHours;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", durationInHours=" + durationInHours + ", fee=" + fee + "]";
	}
	
}
