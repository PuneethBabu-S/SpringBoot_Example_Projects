package com.pbs.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {
	@GetMapping("greet")
	public String greet(@RequestParam String name) {
		return "Welcome to swagger " + name;
	}
	
	@GetMapping("welcome/{fname}/{lname}")
	public String welcome(@PathVariable String fname, @PathVariable String lname) {
		return "Welcome " + fname + " " + lname;
	}
	
}
