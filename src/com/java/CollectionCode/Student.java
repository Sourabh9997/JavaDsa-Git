package com.java.CollectionCode;

import java.util.*;

// Sorting User defined Objects
class Student implements Comparable<Student> {
	public String name;
	int rollno;  
	 
	int age; 

	public Student(String name) {
		this.name = name;
	}

	public int compareTo(Student person) {
		return name.compareTo(person.name);

	}
	
	 
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	
//	public int compareTo(Student st){  
//		if(age==st.age)  
//		return 0;  
//		else if(age>st.age)  
//		return 1;  
//		else  
//		return -1;  
//		}  
}
//Java Comparable interface
//Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.