package com.example.restspring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeException extends RuntimeException {
	
	private String name;
	private String fieldname;
	private Object fieldvalue;
	public EmployeeException(String string, String string2, long id) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getFieldname() {
		return fieldname;
	}
	public Object getFieldvalue() {
		return fieldvalue;
	}


}
