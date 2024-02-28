package com.java.OOPS;

class Student1 {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

public class TestStudent4 {
	public static void main(String args[]) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}
}
/*
In this example, we are creating the two objects of Student class and initializing 
the value to these objects by invoking the insertRecord method. 
Here, 
we are displaying the state (data) of the objects by invoking the displayInformation() method.
*/