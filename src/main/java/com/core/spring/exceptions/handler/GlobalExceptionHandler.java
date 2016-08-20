package com.core.spring.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {
	
	    @ResponseStatus(HttpStatus.BAD_REQUEST)  
	    @ExceptionHandler(value = BaseException.class)  
	    public String handleBaseException(BaseException e){  
	        return e.getMessage();  
	    }  
	  
	    @ExceptionHandler(value = Exception.class)  
	    public String handleException(Exception e){return e.getMessage();}  
	

}
