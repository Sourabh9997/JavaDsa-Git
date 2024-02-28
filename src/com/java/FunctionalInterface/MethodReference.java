package com.java.FunctionalInterface;

public class MethodReference {
	/*
	 * Java provides a new feature called method reference in Java 8. Method
	 * reference is used to refer method of functional interface. It is compact and
	 * easy form of lambda expression. Each time when you are using lambda
	 * expression to just referring a method, you can replace your lambda expression
	 * with method reference. In this tutorial, we are explaining method reference
	 * concept in detail.
	 * 
	 * Types of Method References There are following types of method references in
	 * java:
	 * 
	 * Reference to a static method. 
	 * Reference to an instance method. 
	 * Reference to a
	 * constructor.
	 * 
	 * 
	 * 
	 */
	
	
	/*
	 * In the following example, we have defined a functional interface and referring a static method to it's functional method say().

interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
	 * 
	 * 
	 */
	
	/*
	 * In the following example, we are using predefined functional interface Runnable to refer static method.

public class MethodReference2 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodReference2::ThreadStatus);  
        t2.start();       
    }  
}  
	 * 
	 * 
	 * 
	 * 
	 */
}
