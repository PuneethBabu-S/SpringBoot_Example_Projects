package com.pbs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.model.Course;
import com.pbs.model.Institute;

@Service
public class InstituteService {
	
	@Autowired
	CourseService courseService;
	Scanner sc = new Scanner(System.in);
	Map<Integer, Institute> instituteMap = new HashMap<>();
	
	public void addInstitute() {
		
		Institute institute = new Institute();
		
		System.out.print("Institute ID:");
		institute.setId(sc.nextInt());
		System.out.print("Institute name:");
		institute.setName(sc.next());
		System.out.print("Established in:");
		institute.setEstd(sc.nextInt());
		institute.setCourses(courseService.getCourses());;
		
		instituteMap.put(institute.getId(), institute);
		
		System.out.println("Successfully added course");
	}
	
	public void displayInstitutes() {
		
		for(Entry<Integer, Institute> instMap: instituteMap.entrySet()) {
			System.out.println(instMap.getValue());
		}
	}
	
	
}
