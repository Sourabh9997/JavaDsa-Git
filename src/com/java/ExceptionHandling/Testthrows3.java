package com.java.ExceptionHandling;
import java.io.*;  
public class Testthrows3 {

	/*
	 * here are two cases:
	 * 
	 * Case 1: We have caught the exception i.e. we have handled the exception using
	 * try/catch block. Case 2: We have declared the exception i.e. specified throws
	 * keyword with the method.
	 * 
	 * 
	 * 
	 * Case 2: Declare Exception In case we declare the exception, if exception does
	 * not occur, the code will be executed fine. 
	 * In case we declare the exception
	 * and the exception occurs, it will be thrown at runtime because throws does
	 * not handle the exception. 
	 * 
	 * Let's see examples for both the scenario.
	 * 
	 * A) If exception does not occur
	 * 
	 */
	
	
	   public static void main(String args[])throws IOException{//declare exception  
		     M m=new M();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
		  }  
}
