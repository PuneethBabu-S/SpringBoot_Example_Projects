package com.pbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pbs.controller.Client;

@SpringBootApplication
public class CourseManagementSbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CourseManagementSbApplication.class, args);
		Object o = context.getBean("client");
		((Client) o).startCourseManagement();
	}

}
