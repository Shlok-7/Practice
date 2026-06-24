package com.shlok.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shlok.demo.entity.Student;

@RestController
public class StudentController {
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> stdList=new ArrayList<>();
		Student std1=new Student(101,"Shlok","Genc",97);
		Student std2=new Student(102,"Rama","Genc",98);
		Student std3=new Student(103,"Krishna","Genc",99);
		
		stdList.add(std1);
		stdList.add(std2);
		stdList.add(std3);
		
		return new  ResponseEntity<>(stdList,HttpStatus.OK);

	}

}
