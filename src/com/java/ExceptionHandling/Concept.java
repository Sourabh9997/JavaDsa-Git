package com.java.ExceptionHandling;

public class Concept {
	/*
	 * 
	 * 
	 * The Exception Handling in Java is one of the powerful mechanism to handle the
	 * runtime errors so that the normal flow of the application can be maintained.
	 * 
	 * 
	 * 1) Checked Exception The classes that directly inherit the Throwable class
	 * except RuntimeException and Error are known as checked exceptions. For
	 * example, IOException, SQLException, etc. Checked exceptions are checked at
	 * compile-time.
	 * 
	 * 2) Unchecked Exception The classes that inherit the RuntimeException are
	 * known as unchecked exceptions. For example, ArithmeticException,
	 * NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked
	 * exceptions are not checked at compile-time, but they are checked at runtime.
	 * 
	 * 
	 * 
	 */

	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}
