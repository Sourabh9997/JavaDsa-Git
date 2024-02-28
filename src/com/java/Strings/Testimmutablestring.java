package com.java.Strings;

public class Testimmutablestring {

	/*
	 * Now it can be understood by the diagram given below. Here Sachin is not
	 * changed but a new object is created with Sachin Tendulkar. That is why String
	 * is known as immutable.
	 * 
	 * As you can see in the above figure that two objects are created but s
	 * reference variable still refers to "Sachin" not to "Sachin Tendulkar".
	 * 
	 * But if we explicitly assign it to the reference variable, it will refer to
	 * "Sachin Tendulkar" object.
	 */

	public static void main(String args[]) {
		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects
	}
}
