package com.example.demo.handler;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice// handles any type of exception
public class CustomExceptionHandler {
	
	@ExceptionHandler(value=RuntimeException.class)
	public ErrorMessage handleException(WebRequest req,Throwable e ) {
		
		return new ErrorMessage(req.getDescription(false),LocalDateTime.now(),e.getMessage());
		
		
	}

}
