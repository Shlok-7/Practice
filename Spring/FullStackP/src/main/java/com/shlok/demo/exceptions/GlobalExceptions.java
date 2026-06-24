package com.shlok.demo.exceptions;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.slf4j.Logger;



@ControllerAdvice
public class GlobalExceptions {
	private static final Logger logger =LoggerFactory.getLogger(GlobalExceptions.class);
	
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<String> notfound(ResourceNotFound ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}

}
