package com.java.OOPS;

public class Student7 {
	int id;
	String name;

	Student7(int i, String n) {
		id = i;
		name = n;
	}

	Student7() {
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student7 s1 = new Student7(111, "Karan");
		Student7 s2 = new Student7();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}
//Method 2 of copying object
/*
 * We can copy the values of one object into another by assigning the objects
 * values to another object. In this case, there is no need to create the
 * constructor.
 * 
 * Yes, like object creation, starting a thread, calling a method, etc. You can
 * perform any operation in the constructor as you perform in the method.
 * 
 * The child class inherits all the members of the superclass except the
 * constructors. In other words, constructors cannot be inherited in Java
 * therefore you cannot override constructors. So, writing final before
 * constructors makes no sense.
 * 
 * 
 * But, a constructor in Java cannot be overridden therefore, there is no need
 * of using the final keyword with the constructor. Since you cannot override a
 * constructor you cannot provide body to it if it is made abstract. Therefore,
 * you cannot use abstract keyword with the constructor
 * 
 * 
 * Constructor cannot be final, because it can't be inherited/overridden. static
 * is used for memory management, it means same variable or method will be
 * shared between all instances of a class.
 */