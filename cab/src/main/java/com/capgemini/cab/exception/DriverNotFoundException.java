package com.capgemini.cab.exception;

public class DriverNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 914569459626622748L;
	public DriverNotFoundException(String message){
		super(message);
	}

}
