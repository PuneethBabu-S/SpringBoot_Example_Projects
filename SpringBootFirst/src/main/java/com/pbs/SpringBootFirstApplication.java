package com.pbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.pbs.model.Employee;

@SpringBootApplication
@ComponentScan({"com.pbs","com.other"})
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootFirstApplication.class, args);
		System.out.println("Hello springboot");
		Object e1 = ctx.getBean("employee");
		((Employee) e1).setName("PBS");
		System.out.println(e1);
		Object e2 = ctx.getBean("employee");
		System.out.println(e2);
		Object s1 = ctx.getBean("student");
		System.out.println(s1);
		Object s2 = ctx.getBean("student");
		System.out.println(s2);
		Object a1 = ctx.getBean("address");
		System.out.println(a1);
		Object o1 = ctx.getBean("otherPackageClass");
		System.out.println(o1);
		
	}

}
