package com.cdac.exceptionhandler;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cdac.custom_exceptions.ResourceNotFoundException;

import io.swagger.v3.oas.models.responses.ApiResponse;
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e){
		System.out.println("in catch res not found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(new com.cdac.dto.ApiResponse(e.getMessage()));
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	
	public ResponseEntity<?>handleMethodArguementNotValidException(MethodArgumentNotValidException e)
	{
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
		Map<String, String> rejectedFields =e.getFieldErrors()//List <FieldError>
		.stream()
		.collect(Collectors.toMap(f->f.getField(),
				f->f.getDefaultMessage()));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(rejectedFields);
	}
}
