package com.java.Strings;

public class Concept {

	/*
	 * The java.lang.String class implements Serializable, Comparable and
	 * CharSequence interfaces.
	 * 
	 * CharSequence Interface The CharSequence interface is used to represent the
	 * sequence of characters. String, StringBuffer and StringBuilder classes
	 * implement it. It means, we can create strings in Java by using these three
	 * classes.
	 * 
	 * 
	 * 
	 * The Java String is immutable which means it cannot be changed. Whenever we
	 * change any string, a new instance is created. For mutable strings, you can
	 * use StringBuffer and StringBuilder classes.
	 * 
	 * We will discuss immutable string later. Let's first understand what String in
	 * Java is and how to create the String object.
	 * 
	 * 
	 * There are two ways to create String object:
	 * 
	 * By string literal By new keyword
	 * 
	 * String s="welcome"; Each time you create a string literal, the JVM checks the
	 * "string constant pool" first. If the string already exists in the pool, a
	 * reference to the pooled instance is returned. If the string doesn't exist in
	 * the pool, a new string instance is created and placed in the pool. For
	 * example:
	 * 
	 * String s1="Welcome"; String s2="Welcome";//It doesn't create a new instance
	 * 
	 * 
	 * In the above example, only one object will be created. Firstly, JVM will not
	 * find any string object with the value "Welcome" in string constant pool that
	 * is why it will create a new object. After that it will find the string with
	 * the value "Welcome" in the pool, it will not create a new object but will
	 * return the reference to the same instance.
	 * 
	 * 
	 * Note: String objects are stored in a special memory area known as the
	 * "string constant pool".
	 * 
	 * Why Java uses the concept of String literal? To make Java more memory
	 * efficient (because no new objects are created if it exists already in the
	 * string constant pool).
	 * 
	 * ) By new keyword String s=new String("Welcome");//creates two objects and one
	 * reference variable
	 * 
	 * In such case, JVM will create a new string object in normal (non-pool) heap
	 * memory, and the literal "Welcome" will be placed in the string constant pool.
	 * The variable s will refer to the object in a heap (non-pool).
	 * 
	 */
	public static void main(String args[]) {
		String s1 = "java";// creating string by Java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating Java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//The above code, converts a char array into a String object. 
		//And displays the String objects s1, s2, and s3 on console using println() method.
	}
}