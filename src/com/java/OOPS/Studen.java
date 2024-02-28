package com.java.OOPS;

public class Studen {
	int rollno;  
	String name;  
	float fee;  
	Studen(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	} 
/*
 *In the above example, parameters (formal arguments) and instance variables are same. 
 *So, we are using this keyword to distinguish local variable and instance variable.
 *
 */
