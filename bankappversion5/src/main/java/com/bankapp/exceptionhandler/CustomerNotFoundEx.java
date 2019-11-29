package com.bankapp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFoundEx extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}