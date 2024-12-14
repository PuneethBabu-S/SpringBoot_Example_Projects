package com.pbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServeletController {
	
	@RequestMapping("/login")
	public String loginPage() {
		return "signin.jsp";
	}
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "<h1>Welcome to JSP controller</h1>";
	}
}
