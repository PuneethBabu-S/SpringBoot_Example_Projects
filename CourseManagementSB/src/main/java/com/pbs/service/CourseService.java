package com.pbs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.model.Course;

@Service
public class CourseService {
	
	Scanner sc = new Scanner(System.in);
	
	Map<Integer, Course> courses = new HashMap<>();
	
	public List<Course> getCourses() {
		return new ArrayList<Course>(courses.values());
	}

	public void addCourse() {
		
		Course course = new Course();
		
		System.out.print("Course ID:");
		course.setId(sc.nextInt());
		System.out.print("Course name:");
		course.setName(sc.next());
		System.out.print("Course duration in hours:");
		course.setDurationInHours(sc.nextDouble());
		System.out.print("Course fee:");
		course.setFee(sc.nextDouble());
		
		courses.put(course.getId(), course);
		System.out.println("Successfully added course");
		
		
	}

	public void updateCourseName() {
		this.displayCourses();
		System.out.print("\nCourse ID:");
		int id = sc.nextInt();
		Course course = courses.get(id);
		if(course == null) { 
			System.out.println("No such course");
			return;
			}
		System.out.print("New course name:");
		course.setName(sc.next());
		courses.put(course.getId(), course);
	}

	public void displayCourses() {
		System.out.println("-".repeat(93));
		System.out.println(String.format("| %-20s | %-20s | %-20s | %-20s |", "Course ID", "Course Name", "Course Duration", "Course Fee"));
		System.out.println("-".repeat(93));
		for (Entry<Integer, Course> courseMap : courses.entrySet()) {
		    Course course = courseMap.getValue();
		    System.out.println(String.format("| %-20s | %-20s | %-20.2f | %-20.2f |", 
		        course.getId(), course.getName(), course.getDurationInHours(), course.getFee()));
		}
		System.out.println("-".repeat(93));
	}
	
	public void displayMenu() {
		System.out.println();
		System.out.println("1. Add course");
		System.out.println("2. Update course name");
		System.out.println("3. Add institute");
		System.out.println("4. Display institutes");
		System.out.println("5. Display courses");
		System.out.println("6. Exit");
		System.out.print("Enter option:");
	}
	

}
