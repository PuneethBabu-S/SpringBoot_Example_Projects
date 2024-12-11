package com.pbs.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pbs.service.CourseService;
import com.pbs.service.InstituteService;

@Controller
public class Client {
	
	@Autowired
	CourseService courseService;
	@Autowired
	InstituteService instituteService;
	
	public void startCourseManagement() {
		
		String ch1, ch2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Course Management");
		while(true) {
			
			courseService.displayMenu();
			
			ch1 = sc.next();
			
			switch(ch1) {
			case "1": courseService.addCourse(); break;
			case "2": courseService.updateCourseName(); break;
			case "3": instituteService.addInstitute(); break;
			case "4": instituteService.displayInstitutes(); break;
			case "5": courseService.displayCourses(); break;
			case "6": return;
			default: System.out.println("Enter correct choice"); break;
			}
		}
		
	}
}
