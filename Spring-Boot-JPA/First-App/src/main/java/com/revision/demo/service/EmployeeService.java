package com.revision.demo.service;

import com.revision.demo.models.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee deleteEmployee(int id);
	
	public Employee findEmployeeById(int id);
	
	
}
