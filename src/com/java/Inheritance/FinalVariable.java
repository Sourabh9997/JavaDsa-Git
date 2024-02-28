package com.java.Inheritance;

public class FinalVariable {
	/*
	 * A final variable that is not initialized at the time of declaration is known
	 * as blank final variable.
	 * 
	 * If you want to create a variable that is initialized at the time of creating
	 * object and once initialized may not be changed, it is useful. For example PAN
	 * CARD number of an employee.
	 * 
	 * It can be initialized only in constructor.
	 * 
	 * 
	 * Can we initialize blank final variable?
	 * 
	 * 
	 * 
	 * Yes, but only in constructor. For example:
	 * 
	 * 
	 * 
	 * class Bike10{  
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println(speedlimit);  
  }  
  
  public static void main(String args[]){  
    new Bike10();  
 }  
}  
	 * 
	 */
	
	
	
}
