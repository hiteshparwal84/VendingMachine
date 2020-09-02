package com.vendormachine.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { CustomException.class })
	public ResponseEntity<String> handleCustomException(Exception ex, WebRequest request) {
		String errorMessage = ex.toString();

		return new ResponseEntity<String>(errorMessage, new HttpHeaders(), HttpStatus.OK);

	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<String> handleAnyException(Exception ex, WebRequest request) {
		String errorMessage = ex.getMessage();

		return new ResponseEntity<String>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
