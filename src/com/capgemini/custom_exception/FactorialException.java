package com.capgemini.custom_exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialException extends Exception {

	public FactorialException(String message) {
		super(message);
	}
	

	 
}
