package com.shlok.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shlok.demo.entity.Employee;
import com.shlok.demo.exceptions.ResourceNotFound;
import com.shlok.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> getData(){
		return repository.findAll();
	}
	
	public Employee postData(Employee employee) {
		return repository.save(employee);
	}
	
	public void deleteEmployee(Long id ) {
		Employee emp=repository.findById(id).orElseThrow(()->new ResourceNotFound("Id could"+id+"not found"));
		repository.delete(emp);
	}
	public Employee updateDetails(Long id, Employee updatedEmployee) {
		Employee existingemployee=repository.findById(id).orElseThrow(()-> new ResourceNotFound("Employee not Found !"));
		
		existingemployee.setName(updatedEmployee.getName());
		existingemployee.setEmail(updatedEmployee.getEmail());
		existingemployee.setRole(updatedEmployee.getRole());
		
		return repository.save(existingemployee);

		
	}
	

}
