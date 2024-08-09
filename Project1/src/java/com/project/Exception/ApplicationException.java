package com.project.Exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.model.ExceptionResponse;

@ControllerAdvice
public class ApplicationException {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public @ResponseBody ExceptionResponse handleExceptionOne(HttpServletRequest request, StudentNotFoundException exception) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		 exceptionResponse.setUrl(request.getRequestURI());
		exceptionResponse.setError(exception.getMessage());

		return exceptionResponse;

}
}
