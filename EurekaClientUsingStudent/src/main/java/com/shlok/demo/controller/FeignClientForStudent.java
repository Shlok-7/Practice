package com.shlok.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.shlok.demo.entity.Student;

@FeignClient(name="STUDENT:8081")
public interface FeignClientForStudent {
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudentsFromStudentMicroservice();
	
	

}
