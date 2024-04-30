package com.revision.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revision.demo.models.Employee;
import com.revision.demo.service.EmployeeService;

import lombok.Delegate;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		String msg ="Welcome to Demo App without security" ;
	 return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		Employee saved = empService.saveEmployee(emp);
	 return new ResponseEntity<Employee>(saved,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(name="id") Integer id){
		Employee deleted = empService.deleteEmployee(id);
	 return new ResponseEntity<Employee>(deleted,HttpStatus.OK);
	}
	
//	@PutMapping("/update")
//	public ResponseEntity<String> updateEmployee(@RequestParam ){
//		String msg ="Welcome to Demo App without security" ;
//	 return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
//	}
//	
	@GetMapping("/user/{id}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable Integer id){
		Employee user = empService.findEmployeeById(id);
	 return new ResponseEntity<Employee>(user,HttpStatus.OK);
	}

	
}
