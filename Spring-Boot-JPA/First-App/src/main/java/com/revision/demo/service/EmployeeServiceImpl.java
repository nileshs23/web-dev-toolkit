package com.revision.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revision.demo.models.Employee;
import com.revision.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.saveAndFlush(employee);
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> empOpt =  empRepo.findById(id);
		
		if(empOpt.isPresent()) {
			Employee deleted = empOpt.get();
			empRepo.delete(deleted);
			return deleted;
		}else {
			throw new NullPointerException();
		}
	}

	@Override
	public Employee findEmployeeById(int id) {
		Optional<Employee> empOpt =  empRepo.findById(id);
		
		if(empOpt.isPresent()) {
			Employee deleted = empOpt.get();
			empRepo.delete(deleted);
			return deleted;
		}else {
			throw new NullPointerException();
		}
	}

}
