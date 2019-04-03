package com.capgemini.exception.main;

import com.capgemini.custom_exception.ExceedValueException;
import com.capgemini.custom_exception.InvalidInputException;

public class Factorial {

	
	public int number;
    public long result=1;
	public Factorial(int number) {

		this.number = number;
	}
	public long getFactorial() throws InvalidInputException,ExceedValueException {
		if(number<2)
			throw new InvalidInputException("less than two");
	
		for(int i=1;i<=number;i++) 
		{
			result=result*i;
		}
	 
		 
		if(result>Integer.MAX_VALUE) {
			throw new ExceedValueException("max value");
		}
		return result;
	}
	
	
	
	
	
	/*
	 * if(n<2) { throw new InvalidInputException("invalid input") }
	 * 
	 * else { result=1;  }
	 */
    
		
}

