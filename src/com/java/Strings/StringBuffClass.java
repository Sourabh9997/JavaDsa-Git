package com.java.Strings;

public class StringBuffClass {

	/*
	 * Java StringBuffer class is used to create mutable (modifiable) String
	 * objects. The StringBuffer class in Java is the same as String class except it
	 * is mutable i.e. it can be changed.
	 * 
	 * Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot
	 * access it simultaneously. So it is safe and will result in an order.
	 * 
	 */
	
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		}  
	/*
	 * Insert method
	 * 
	 * class StringBufferExample2{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb);//prints HJavaello  
}  
}  
	 * 
	 * 
	 */

}
