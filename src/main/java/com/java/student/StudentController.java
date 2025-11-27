package com.java.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	private List<Student>students=new ArrayList<>(List.of(
			
			new Student(1, "mahesh", "vizag"),
			new Student(2, "madhu","sr nagar"),
			new Student(3, "venky","hyd")
			
			));
	
	
	@GetMapping("/students")
	public List<Student>getallStudents(){
		
		
		return students;
	}
	
	

	@GetMapping("/csrf")
	public org.springframework.security.web.csrf.CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return (org.springframework.security.web.csrf.CsrfToken) request.getAttribute("_csrf");
	}

}
