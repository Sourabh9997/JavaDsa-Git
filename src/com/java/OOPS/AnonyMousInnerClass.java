package com.java.OOPS;

public class AnonyMousInnerClass {
	/*
	 * 
	 * Java anonymous inner class is an inner class without a name and for which
	 * only a single object is created.
	 * 
	 * 
	 * In simple words, a class that has no name is known as an anonymous inner
	 * class in Java. It should be used if you have to override a method of class or
	 * interface. Java Anonymous inner class can be created in two ways:
	 * 
	 * 
	 * Class (may be abstract or concrete). 
	 * Interface
	 * 
	 * 
	 */
	
	
	/*
	 * abstract class Person{  
  abstract void eat();  
}  
class TestAnonymousInner{  
 public static void main(String args[]){  
  Person p=new Person(){  
  void eat(){System.out.println("nice fruits");}  
  };  
  p.eat();  
 }  
}  
	 * 
	 * 
	 * Internal working of given code
Person p=new Person(){  
void eat(){System.out.println("nice fruits");}  
};  
	 * 
	 * 
	 * 
	 * A class is created, but its name is decided by the compiler, 
	 * which extends the Person class and provides the implementation of the eat() method.
		An object of the Anonymous class is created that is referred to by 'p,' a reference variable of Person type.
	 * 
	 */
}
