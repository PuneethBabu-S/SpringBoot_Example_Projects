package com.pbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootSecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootSecondApplication.class, args);
		Object ge = context.getBean("getEmployee");
		System.out.println(ge);
		Object ge1 = context.getBean("getEmployee");
		System.out.println(ge1);
		Object ge2 = context.getBean("getEmployee1");
		System.out.println(ge2);
		
	}

}
