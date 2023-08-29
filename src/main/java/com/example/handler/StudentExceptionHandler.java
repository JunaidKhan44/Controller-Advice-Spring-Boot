/**
 * 
 */
package com.example.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.InvalidFieldException;

/**
 * @author Junaid.khan
 *
 */

//in case of service @RestControllerAdvice combination of both @ResponseBody
//@ControllerAdvice
@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler
	//@ResponseBody
	public String handleInvalidFieldException(InvalidFieldException exception) {
		return exception.getMessage();
	}

}
