package com.revision.service;

import com.revision.models.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee);
	
	public boolean updateEmployee(Employee employee);
	
	public boolean deleteEmployee(int id);
	
	public Employee findEmployeeById(int id);
	
	
}
