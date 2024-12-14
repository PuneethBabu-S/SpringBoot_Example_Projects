package com.pbs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pbs.model.Emp;

@RestController
public class ContentNegotiationController {
	
	@GetMapping(path="method1", produces = "text/json")
	public String method1() {
		return "<html><body><h1>Welcome to content negotiation</h1></body></html>";
	}
	
	@GetMapping(path="emps", produces = "application/xml")
	public List<Emp> getEmp(){
		List<Emp> list = new ArrayList<>();
		list.add(new Emp("PBS",21));
		list.add(new Emp("PBS",21));
		list.add(new Emp("PBS",21));
		list.add(new Emp("PBS",21));
		list.add(new Emp("PBS",21));
		return list;
	}
}
