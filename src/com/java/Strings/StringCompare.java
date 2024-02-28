package com.java.Strings;

public class StringCompare {
	/*
	 * We can compare String in Java on the basis of content and reference.
	 * 
	 * It is used in authentication (by equals() method), sorting (by compareTo()
	 * method), reference matching (by == operator) etc.
	 * 
	 * There are three ways to compare String in Java:
	 * 
	 * By Using equals() Method By Using == Operator By compareTo() Method
	 * 
	 * 
	 */

	public static void main(String args[]) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
	}

	/*
	 * By Using compareTo() method The String class compareTo() method compares
	 * values lexicographically and returns an integer value that describes if first
	 * string is less than, equal to or greater than second string.
	 * 
	 * Suppose s1 and s2 are two String objects. If:
	 * 
	 * s1 == s2 : The method returns 0. 
	 * s1 > s2 : The method returns a positive
	 * value. 
	 * s1 < s2 : The method returns a negative value.
	 * 
	 * 
	 * class Teststringcomparison4{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
 }  
}  

class TestStringConcatenation2{  
 public static void main(String args[]){  
   String s=50+30+"Sachin"+40+40;  
   System.out.println(s);//80Sachin4040  
 }  
}  



	 * 
	 * 
	 *  After a string literal, all the + will be treated as string concatenation operator.
	 *  
	 *  
	 *  
	 *  
	 */
}

