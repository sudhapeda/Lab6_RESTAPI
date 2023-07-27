package com.glearning.sta.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Component
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value =NoSuchElementException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String invalidEmployeeId(NoSuchElementException exception) {
		return "Invalid Student id passes";
	}

}
