package com.wizeline.wizelinego.exception;

import java.util.Date;

import javax.validation.UnexpectedTypeException;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Exception Manager
 */


@ControllerAdvice
public class ControllerExceptionHandler {

	  @ExceptionHandler(ResourceNotFoundException.class)
	  public ResponseEntity<ErrorMessage> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	        HttpStatus.NOT_FOUND.value(),
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
	  }
	  
	  @ExceptionHandler(UnexpectedTypeException.class)
	  public ResponseEntity<ErrorMessage> unexpectedTypeException(ResourceNotFoundException ex, WebRequest request) {
		    ErrorMessage message = new ErrorMessage(
		        HttpStatus.BAD_REQUEST.value(),
		        new Date(),
		        ex.getMessage(),
		        request.getDescription(false));
		    
		    return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
		  }

	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
	    ErrorMessage message = new ErrorMessage(
	        HttpStatus.INTERNAL_SERVER_ERROR.value(),
	        new Date(),
	        ex.getMessage(),
	        request.getDescription(false));
	    
	    return new ResponseEntity<ErrorMessage>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	  }	
	
}
