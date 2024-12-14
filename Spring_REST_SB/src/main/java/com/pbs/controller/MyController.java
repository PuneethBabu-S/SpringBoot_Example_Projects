package com.pbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String demo1() {
		return "<h1>This is a demo method</h1>";
	}
}
