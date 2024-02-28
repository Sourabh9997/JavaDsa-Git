package com.java.ExceptionHandling;

public class TestFinallyBlock {
	/*
	 * 
	 * 
	 * Java finally block is a block used to execute important code such as closing
	 * the connection, etc.
	 * 
	 * Java finally block is always executed whether an exception is handled or not.
	 * Therefore, it contains all the necessary statements that need to be printed
	 * regardless of the exception occurs or not.
	 * 
	 * The finally block follows the try-catch block.
	 * 
	 * Note: If you don't handle the exception, before terminating the program, JVM
	 * executes finally block (if any).
	 * 
	 * 
	 * 
	 * finally block in Java can be used to put "cleanup" code such as closing a
	 * file, closing connection, etc. The important statements to be printed can be
	 * placed in the finally block.
	 * 
	 * 
	 * Let's see the below example where the Java program does not throw any
	 * exception, and the finally block is executed after the try block.
	 * 
	 */
	
	 public static void main(String args[]){    
		  try{    
		//below code do not throw any exception  
		   int data=25/5;    
		   System.out.println(data);    
		  }    
		//catch won't be executed  
		  catch(NullPointerException e){  
		System.out.println(e);  
		}    
		//executed regardless of exception occurred or not  
		 finally {  
		System.out.println("finally block is always executed");  
		}    
		    
		System.out.println("rest of phe code...");    
		  }    

}
