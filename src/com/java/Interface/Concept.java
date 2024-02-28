package com.java.Interface;

public class Concept {
	/*
	 * 
	 * An interface in Java is a blueprint of a class. It has static constants and
	 * abstract methods.
	 * 
	 * The interface in Java is a mechanism to achieve abstraction. There can be
	 * only abstract methods in the Java interface, not method body. It is used to
	 * achieve abstraction and multiple inheritance in Java.
	 * 
	 * In other words, you can say that interfaces can have abstract methods and
	 * variables. It cannot have a method body.
	 * 
	 * Java Interface also represents the IS-A relationship.
	 * 
	 * 
	 * 
	 * It cannot be instantiated just like the abstract class.
	 * 
	 * Since Java 8, we can have default and static methods in an interface.
	 * 
	 * Since Java 9, we can have private methods in an interface.
	 * 
	 * 
	 * 
	 * There are mainly three reasons to use interface. They are given below.
	 * 
	 * It is used to achieve abstraction. By interface, we can support the
	 * functionality of multiple inheritance. It can be used to achieve loose
	 * coupling.
	 * 
	 * 
	 * 
	 * How to declare an interface? An interface is declared by using the interface
	 * keyword. It provides total abstraction; means all the methods in an interface
	 * are declared with the empty body, and all the fields are public, static and
	 * final by default. A class that implements an interface must implement all the
	 * methods declared in the interface.
	 * 
	 * 
	 * 
	 * The Java compiler adds public and abstract keywords before the interface
	 * method. 
	 * Moreover, it adds public, static and final keywords before data
	 * members.
	 * 
	 * A class extends another class, an interface extends another interface, but a class implements an interface.
	 * 
	 * 
	 * Example
	 * 
	 * 
	 * interface printable{  
	void print();  
	}  
	class A6 implements printable{  
	public void print(){System.out.println("Hello");}  
  
	public static void main(String args[]){  
	A6 obj = new A6();  
	obj.print();  
 	}  
	}  

 the Printable interface has only one method, and its implementation is provided in the A6 class.


//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class TestInterface1{  
public static void main(String args[]){  
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  



	 */
	
	
	/*
	 * 
	 * Multiple inheritance in Java by interface
	 * 
		If a class implements multiple interfaces, or an interface extends multiple interfaces, 
		it is known as multiple inheritance.
	 * 
	 * 
	 */
	
	
	
	/*
	 * 
	 * 
	 * Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of 
ambiguity. 
However, it is supported in case of an interface because there is no ambiguity.
 It is because its implementation is provided by the implementation class. For example:
	 * 
	 * 
	 * 
	 * 
	 * 
	 * As you can see in the above example, Printable and Showable interface have same methods but 
	 * its implementation is provided by class TestTnterface1, 
	 * so there is no ambiguity.
	 * 
	 * 
	 * An interface which has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote, etc. 
	 * They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
	 * 
	 * 
	 * 
	 */
}
