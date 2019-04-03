package com.capgemini.exception.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.custom_exception.AgeNotWithinRangeException;
import com.capgemini.custom_exception.NameNotValidException;

 
public class Student {

	private String regx ="^[\\p{L} .'-]+$";
	Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	private int rollNumber;
	private String studentName;
	private int studentAge;
	private String courseName;
	
	public Student() {
		
	}
	
	public Student(int rollNumber, String studentName, int studentAge, String courseName) {
		this.rollNumber = rollNumber;
		 
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) throws NameNotValidException {
		Matcher matcher = pattern.matcher(studentName);
		if(!matcher.find())
			throw new NameNotValidException("Name should not contain special characters and numbers");
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	 

		
	}	

