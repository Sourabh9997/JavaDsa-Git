package com.java.OOPS;

 
	//Test class to show the values of objects  
	public class TestStaticVariable1{  
	 public static void main(String args[]){  
	 Student8 s1 = new Student8(111,"Karan");  
	 Student8 s2 = new Student8(222,"Aryan");  
	 //we can change the college of all objects by the single line of code  
	 //Student.college="BBDIT";  
	 s1.display();  
	 s2.display();  
}
}