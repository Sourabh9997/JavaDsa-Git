package com.java.OOPS;
//Java Program to demonstrate the use of a static method.  

public class TestStaticMethod {
	public static void main(String args[]) {
		Student9.change();// calling change method
		// creating objects
		Student9 s1 = new Student9(111, "Karan");
		Student9 s2 = new Student9(222, "Aryan");
		Student9 s3 = new Student9(333, "Sonoo");
		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}
/*
 * If you apply static keyword with any method, it is known as static method.
 * 
 * A static method belongs to the class rather than the object of a class. A
 * static method can be invoked without the need for creating an instance of a
 * class. A static method can access static data member and can change the value
 * of it.
 * 
 * Restrictions for the static method There are two main restrictions for the
 * static method. They are:
 * 
 * 1 The static method can not use non static data member or call non-static
 * method directly. 2 this and super cannot be used in static context.
 * 
 * 
 * Why is the Java main method static?
Ans) It is because the object is not required to call a static method. If it were a non-static method, 
JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
 */



/*

Java static block
Is used to initialize the static data member.
It is executed before the main method at the time of classloading.

class A2{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}  
*/
