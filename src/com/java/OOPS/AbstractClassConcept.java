package com.java.OOPS;

public class AbstractClassConcept {
	/*
	 * 
	 * 
	 * A class which is declared as abstract is known as an abstract class. It can
	 * have abstract and non-abstract methods. It needs to be extended and its
	 * method implemented. It cannot be instantiated.
	 * 
	 * 
	 * 
	 * An abstract class must be declared with an abstract keyword. It can have
	 * abstract and non-abstract methods. It cannot be instantiated. It can have
	 * constructors and static methods also. It can have final methods which will
	 * force the subclass not to change the body of the method.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * In this example, Shape is the abstract class, and its implementation is
	 * provided by the Rectangle and Circle classes.
	 * 
	 * Mostly, we don't know about the implementation class (which is hidden to the
	 * end user), and an object of the implementation class is provided by the
	 * factory method.
	 * 
	 * A factory method is a method that returns the instance of the class. We will
	 * learn about the factory method later.
	 * 
	 * In this example, if you create the instance of Rectangle class, draw() method
	 * of Rectangle class will be invoked.
	 * 
	 * 
	 * 
	 */
	
	
	/*
	 * 
	 * abstract class Shape{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user 
 *  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
s.draw();  
}  
}  
	 */
	
	
	
	/*
	 * 
	 * An abstract class can have a data member, abstract method, method body (non-abstract method), constructor,
	 *  and even main() method
	 * .
	 * 
	 * Rule: If there is an abstract method in a class, that class must be abstract.
	 * 
	 * If you are extending an abstract class that has an abstract method, 
	 * you must either provide the implementation of the method 
	 * or make this class abstract.
	 * 
	 * 
	 * 
	 * 
	 * The abstract class can also be used to provide some implementation of the interface. 
	 * In such case, the end user may not be forced to override all the methods of the interface.
	 * 
	 * interface A{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class B implements A{  
public void c(){System.out.println("I am c");}  
}  
  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class Test5{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}  

Output:I am a
       I am b
       I am c
       I am d
	 * 
	 */
	
	/*
	 * //Example of an abstract class that has abstract and non-abstract methods  
	 * 
 abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike{  
 void run(){System.out.println("running safely..");}  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  
	 */
}
