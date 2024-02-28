package com.java.ExceptionHandling;

import java.io.*;

public class TestExceptionChild extends Parent {

	/*
	 * There are many rules if we talk about method overriding with exception
	 * handling.
	 * 
	 * 
	 * 
	 * If the superclass method does not declare an exception, subclass overridden
	 * method cannot declare the checked exception but it can declare unchecked
	 * exception. If the superclass method declares an exception, subclass
	 * overridden method can declare same, subclass exception or no exception but
	 * cannot declare parent exception.
	 * 
	 * 
	 * 
	 * Rule 1: If the superclass method does not declare an exception, subclass
	 * overridden method cannot declare the checked exception
	 */

	// overriding the method in child class
	// gives compile time error
	// void msg() throws IOException {
	// System.out.println("TestExceptionChild");
	// }

	/*
	 * public static void main(String args[]) { Parent p = new TestExceptionChild();
	 * p.msg(); }
	 */

	/*
	 * Rule 2: If the superclass method does not declare an exception, subclass
	 * overridden method cannot declare the checked exception but can declare
	 * unchecked exception.
	 * 
	 * 
	 * 
	 */
	void msg()throws ArithmeticException {    
	    System.out.println("child method");    
	  }    
	  
	  public static void main(String args[]) {    
	   Parent p = new TestExceptionChild();    
	   p.msg();    
	  }    
}
