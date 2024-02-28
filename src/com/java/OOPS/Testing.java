package com.java.OOPS;

public class Testing {
	public static void main(String args[]) {
		Stu s1 = new Stu(111, "ankit", "java");
		Stu s2 = new Stu(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}
//Real usage of this() constructor call
/*
 * The this() constructor call should be used to reuse the constructor from the
 * constructor. It maintains the chain between the constructors i.e. it is used
 * for constructor chaining. Let's see the example given below that displays the
 * actual use of this keyword.
 * 
 */
