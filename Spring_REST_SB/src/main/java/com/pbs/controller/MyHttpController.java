package com.pbs.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHttpController {
	
	@PostMapping("/rest/http/demo")
	public String inputRecord() {
		System.out.println("Inserting record");
		return "Invoked REST API using POST";
	}
	
	@DeleteMapping("/rest/http/demo")
	public String deleteRecord() {
		System.out.println("Deleting record");
		return "Invoked REST API using Delete";
	}
	
	@PutMapping("/rest/http/demo")
	public String putRecord() {
		System.out.println("Updating record");
		return "Invoked REST API using PUT";
	}
	
	@GetMapping("/rest/http/demo")
	public String getRecord() {
		System.out.println("Retreiving record");
		return "Invoked REST API using GET";
	}
}
