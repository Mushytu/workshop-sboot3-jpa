package com.mushservices.project.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mushservices.project.services.exceptions.DatabaseException;
import com.mushservices.project.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e1, HttpServletRequest request) {
		String errorMessage = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND; 
		StandardError error = new StandardError(Instant.now(), status.value(), errorMessage, e1.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(error);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e1, HttpServletRequest request) {
		String errorMessage = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST; 
		StandardError error = new StandardError(Instant.now(), status.value(), errorMessage, e1.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(error);
	}
}
