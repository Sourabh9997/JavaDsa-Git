package com.java.Inheritance;

public class MethodOverload {
	/*
	 * Different ways to overload the method There are two ways to overload the
	 * method in java
	 * 
	 * By changing number of arguments 
	 * By changing the data type
	 * 
	 * class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}}  
	 * 
	 * Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
	 * But JVM calls main() method which receives string array as arguments only. Let's see the simple example:
	 * 
	 * 
	 * 
	 * class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
} 
	 * 
	 * 
	 */
}
