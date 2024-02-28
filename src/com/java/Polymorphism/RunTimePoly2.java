package com.java.Polymorphism;

public class RunTimePoly2 {
//Java Runtime Polymorphism with Data Member

	/*
	 * 
	 * 
	 * A method is overridden, not the data members, so runtime polymorphism can't
	 * be achieved by data members.
	 * 
	 * In the example given below, both the classes have a data member speedlimit.
	 * We are accessing the data member by the reference variable of Parent class
	 * which refers to the subclass object. Since we are accessing the data member
	 * which is not overridden, hence it will access the data member of the Parent
	 * class always.
	 * 
	 * 
	 * 
	 */
	
	
	/*
	 * class Bike{  
 int speedlimit=90;  
}  
class Honda3 extends Bike{  
 int speedlimit=150;  
  
 public static void main(String args[]){  
  Bike obj=new Honda3();  
  System.out.println(obj.speedlimit);//90  
}  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/*
	 * Java Runtime Polymorphism with Multilevel Inheritance
	 * 
	 * 
	 * 
	 * 
	 * 
	 * class Animal{  
void eat(){System.out.println("animal is eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("dog is eating...");}  
}  
class BabyDog1 extends Dog{  
public static void main(String args[]){  
Animal a=new BabyDog1();  
a.eat();  
}}  
	 * 
	 * 
	 * Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.
	 * 
	 */
}
