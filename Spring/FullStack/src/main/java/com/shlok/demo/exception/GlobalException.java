package com.shlok.demo.exception;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalException {
	private static final Logger logger =org.slf4j.LoggerFactory.getLogger(GlobalException.class);

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex){
		logger.error("Exception Caught:{}",ex.getMessage());
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
		
		
	}
}
