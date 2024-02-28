package com.java.ExceptionHandling;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String str) {
		// calling the constructor of parent Exception
		super(str);

	}
	/*
	 * 
	 * Let's see a simple example of Java custom exception. In the following code,
	 * constructor of InvalidAgeException takes a string as an argument. This string
	 * is passed to constructor of parent class Exception using the super() method.
	 * Also the constructor of Exception class can be called without using a
	 * parameter and calling super() method is not mandatory.
	 * 
	 * 
	 * Note: We need to write the constructor that takes the String as the error
	 * message and it is called parent class constructor.
	 */
}
