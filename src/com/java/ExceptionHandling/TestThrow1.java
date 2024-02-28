package com.java.ExceptionHandling;

public class TestThrow1 {

	/*
	 * We specify the exception object which is to be thrown. The Exception has some
	 * message with it that provides the error description. These exceptions may be
	 * related to user inputs, server, etc.
	 * 
	 * We can throw either checked or unchecked exceptions in Java by throw keyword
	 * 
	 * 
	 * We can also define our own set of conditions and throw an exception
	 * explicitly using throw keyword. For example, we can throw ArithmeticException
	 * if we divide a number by another number. Here, we just need to set the
	 * condition and throw exception using throw keyword.
	 * 
	 * The syntax of the Java throw keyword is given below.
	 * 
	 * throw Instance i.e.,
	 * 
	 * 
	 * throw new exception_class("error message"); Let's see the example of throw
	 * IOException.
	 * 
	 * throw new IOException("sorry device error");
	 * 
	 * 
	 * In this example, we have created the validate method that takes integer value
	 * as a parameter. If the age is less than 18, we are throwing the
	 * ArithmeticException otherwise print a message welcome to vote.
	 * 
	 */
	
	  //function to check if person is eligible to vote or not   
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validate(13);  
        System.out.println("rest of the code...");  
        
        /*
         *  If we throw unchecked exception from a method, it is must to handle the exception or declare in throws clause.
         * 
         * 
         */
  }    
}

