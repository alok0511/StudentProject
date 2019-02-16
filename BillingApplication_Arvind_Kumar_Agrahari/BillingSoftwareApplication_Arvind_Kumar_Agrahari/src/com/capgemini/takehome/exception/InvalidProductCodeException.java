package com.capgemini.takehome.exception;

public class InvalidProductCodeException extends Exception {

	private static final long serialVersionUID = 1L;

	// Constructor for InvalidProductCodeException with parameter String
	public InvalidProductCodeException(String str) {
		super(str);
	}

	// User implemented toString method for InvalidProductCodeException
	@Override
	public String toString() {
		return "InvalidProductCodeException";
	}

	// Override getMessage method for getting the message for InvalidProductCodeException
	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
