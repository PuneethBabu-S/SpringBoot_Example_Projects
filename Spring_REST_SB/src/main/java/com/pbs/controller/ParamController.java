package com.pbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pbs.model.Emp;

@RestController
public class ParamController {
	
	@GetMapping("/qparam")
	public String queryParam(@RequestParam String name, @RequestParam int age) {
		return "Welcome " + name + " and you are " + age + " years old.";
	}
	
	@GetMapping("/pathvar/{name}/{age}")
	public String pathParam(@PathVariable String name, @PathVariable Integer age) {
		return "Welcome " + name + " and you are " + age + " years old.";
	}
	
	@GetMapping("/reqbody")
	public String reqbody( @RequestBody Emp emp, @RequestParam int salary) {
		return "Welcome " + emp.getName() + " and you are " + emp.getAge() + " years old with salary "+ salary;
	}
	
}


