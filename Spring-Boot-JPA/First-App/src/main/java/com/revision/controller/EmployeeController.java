package com.revision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revision.service.EmployeeService;

@RestController
@RequestMapping("/user")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		String msg ="Welcome to Demo App without security" ;
	 return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	
}
