package com.java.Polymorphism;

public class StaticDynamicBinding {
	/*
	 * 
	 * When type of the object is determined at compiled time(by the compiler), it
	 * is known as static binding.
	 * 
	 * If there is any private, final or static method in a class, there is static
	 * binding.
	 * 
	 * When type of the object is determined at run-time, it is known as dynamic
	 * binding.
	 * 
	 * 
	 * 
	 */

	/*
	 * 
	 * 
	 * class Animal{ void eat(){System.out.println("animal is eating...");} }
	 * 
	 * class Dog extends Animal{ void eat(){System.out.println("dog is eating...");}
	 * 
	 * public static void main(String args[]){ Animal a=new Dog(); a.eat(); } }
	 * Output:dog is eating...
	 * 
	 * 
	 * 
	 * In the above example object type cannot be determined by the compiler,
	 * because the instance of Dog is also an instance of Animal. So compiler
	 * doesn't know its type, only its base type.
	 * 
	 */

	// InstanceOF operator concept

	/*
	 * 
	 * 
	 * The java instanceof operator is used to test whether the object is an
	 * instance of the specified type (class or subclass or interface).
	 * 
	 * The instanceof in java is also known as type comparison operator because it
	 * compares the instance with type. It returns either true or false. If we apply
	 * the instanceof operator with any variable that has null value, it returns
	 * false.
	 * 
	 * 
	 * 
	 * class Simple1{  
 public static void main(String args[]){  
 Simple1 s=new Simple1();  
 System.out.println(s instanceof Simple1);//true  
 }  
}
	 * 
	 */
}
