package com.java.FunctionalInterface;

public class Concept {
	/*
	 * 
	 * An Interface that contains exactly one abstract method is known as functional
	 * interface. It can have any number of default, static methods but can contain
	 * only one abstract method. It can also declare methods of object class.
	 * 
	 * Functional Interface is also known as Single Abstract Method Interfaces or
	 * SAM Interfaces. It is a new feature in Java, which helps to achieve
	 * functional programming approach.
	 * 
	 */
	
	
	/*
	 * @FunctionalInterface  
interface sayable{  
    void say(String msg);  
}  
public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
    }  
}  
	 * 
	 * 
	 */
	/*
	 * 
	 * Invalid Functional Interface
		A functional interface can extends another interface only when it does not have any abstract method.
	 * interface sayable{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
interface Doable extends sayable{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  
	 */
	
	
	/*
	 * 
	 * 
	 * In the following example, a functional interface is extending to a non-functional interface.

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Sayable extends Doable{  
    void say(String msg);   // abstract method  
}  
public class FunctionalInterfaceExample3 implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  
	 * 
	 * 
	 * 
	 */
	
}
