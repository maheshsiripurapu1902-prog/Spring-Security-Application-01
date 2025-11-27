package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultLoginController {
	
	@GetMapping("/")
	public String getLogInPage() {
		
		return "welcome to first Application";
	}

}
