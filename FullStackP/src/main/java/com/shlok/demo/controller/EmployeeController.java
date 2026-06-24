package com.shlok.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shlok.demo.entity.Employee;
import com.shlok.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping
	public List<Employee> getData(){
		return service.getData();
		
	}
	@PostMapping
	public Employee postdata(@RequestBody Employee employee) {
		return service.postData(employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id ) {
		service.deleteEmployee(id);
	}
	@PutMapping("/{id}")
	public Employee updateData(@PathVariable Long id ,@RequestBody Employee employee) {
		return service.updateDetails(id, employee);
	}

}
