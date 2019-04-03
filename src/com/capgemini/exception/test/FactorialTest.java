package com.capgemini.exception.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.custom_exception.ExceedValueException;
import com.capgemini.custom_exception.InvalidInputException;
import com.capgemini.exception.main.Factorial;

 


public class FactorialTest {

private Factorial factorial;
	
	@Before
	public void setUp() {
	 factorial = new Factorial(1);
		
	}
	@Test
	public void testFactorialResult() throws InvalidInputException, ExceedValueException {
		Factorial factorial= new Factorial(5);
		assertEquals(120,factorial.getFactorial(),0.01);
	}
	@Test(expected=InvalidInputException.class)
	public void testFactorialInputLessThanTwo() throws InvalidInputException, ExceedValueException {
	   factorial.getFactorial();
	}
	@Test(expected=ExceedValueException.class)
	public void testFactorialExceedValueException() throws InvalidInputException, ExceedValueException {
		Factorial factorial= new Factorial(18);
		factorial.getFactorial();
	}

}
