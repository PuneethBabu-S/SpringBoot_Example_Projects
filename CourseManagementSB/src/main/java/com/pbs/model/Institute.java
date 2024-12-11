package com.pbs.model;

import java.util.List;

public class Institute {
	private int id;
	private String name;
	private int estd;
	private List<Course> courses;
	
	public Institute() {
	}
	
	public Institute(int id, String name, int estd, List<Course> courses) {
		this.id = id;
		this.name = name;
		this.estd = estd;
		this.courses = courses;
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
	public int getEstd() {
		return estd;
	}
	public void setEstd(int estd) {
		this.estd = estd;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", estd=" + estd + ", courses=" + courses + "]";
	}
	
}
