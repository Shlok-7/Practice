package com.shlok.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  // Global exception handler for all controllers
public class GenericExceptionHandler {
	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<String>NoUserFoundExceptionHandler(NoUserFoundException ex){
		String strMsg=ex.getMessage();
		
		return new ResponseEntity<>(strMsg,HttpStatus.NOT_FOUND);
	}

}
