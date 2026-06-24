package com.shlok.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shlok.demo.entity.Student;

@RestController
public class MyController {
	
	@Autowired
	FeignClientForStudent feignClientForStudent;
	
	@GetMapping("/getAllDataFromMS")
	public ResponseEntity<List<Student>> getAllDataFromMS(){
		ResponseEntity<List<Student>> stuList=feignClientForStudent.getAllStudentsFromStudentMicroservice();
		
		return stuList;
	}
	

}
