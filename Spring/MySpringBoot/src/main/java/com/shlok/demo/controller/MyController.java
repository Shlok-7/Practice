package com.shlok.demo.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shlok.demo.data.Books;
import com.shlok.demo.exception.NoUserFoundException;
import com.shlok.demo.repository.IBookRepository;
import com.shlok.demo.service.MyService;

import java.util.*;

@RestController
public class MyController {
	// Controller will talk to service , controller will just ask what to do , service will do the work for controller 
	@Autowired
	MyService serviceobj;
	
	static final Logger logger=LoggerFactory.getLogger(MyController.class);
	
	//http://localhost:8091/hello
	@GetMapping("/hello")
	public String Hello() {
		return "<h1>Hello Shlok,testing the very first project </h1>";
	}
	
	// Passing Parameters from client to server /Spring REST
	//http://localhost:8091/login?UserId=Shlok&Pass=Admin
	@GetMapping("/login")
	public ResponseEntity<String> login(@RequestParam String UserId , @RequestParam String Pass){
		String strMessage=" ";
		if(UserId.equals("Shlok") && Pass.equals("Admin")) {
			strMessage="You are a valid user ";
			return new ResponseEntity<> (strMessage,HttpStatus.OK);
		}
		else {
			strMessage="Sorry, you are not a valid user";
			return new ResponseEntity<> (strMessage,HttpStatus.UNAUTHORIZED);
		}
		
	}
	//http://localhost:8091/insert
	@PostMapping("/insert")
	public ResponseEntity <String> insert(@RequestBody Books obj1){
		logger.info("Book information is:"+obj1);
		serviceobj.addBook(obj1);
		return new ResponseEntity<>("Record Inserted Successfully", HttpStatus.CREATED);
		
	}
	
	//updating the data in the db
	@PutMapping("/update")
	public ResponseEntity <String> update(@RequestBody Books obj2){
		logger.info("Book information is:"+obj2);
		serviceobj.updateBooks(obj2);
		String strmsg="Record Updated Successfully";
		return new ResponseEntity<>(strmsg, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		logger.info("Record to delete with given id is :"+id);
		String msg="Record Deleted Successfully";
		serviceobj.deleteBooks(id);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	//------------------------------------------------------------------
	//Spring JPA
	//Fetch all record from book table
	// SELECT * FROM Books -----> Uses FindALl()
	@GetMapping("/getAllbooks")
	public ResponseEntity<List<Books>> getAllbooks(){
		List<Books>booklst= serviceobj.getAllbooks();
		
		return new ResponseEntity<>(booklst , HttpStatus.CREATED);
	}
	
	@GetMapping("/getData/{id}")
	public ResponseEntity<String>getData(@PathVariable int id) throws NoUserFoundException{
		if(id==1) {
			String strName="Shlok";
			return new ResponseEntity<>(strName,HttpStatus.OK);
		}
		else {
			throw new NoUserFoundException("No user Found for this id.....");
		}
	}

}