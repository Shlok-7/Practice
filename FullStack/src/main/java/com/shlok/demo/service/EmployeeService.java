package com.shlok.demo.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shlok.demo.entity.Employee;
import com.shlok.demo.exception.ResourceNotFoundException;
import com.shlok.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
		
	}
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public void deleteEmployee(Long id) {
		Employee emp=repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee Id"+id+"not found"));
		repository.delete(emp);
	}

}
