package com.java.OOPS;

public class UsageOfThisKeyword {

	/*
	 * this can be used to refer current class instance variable. this can be used
	 * to invoke current class method (implicitly) this() can be used to invoke
	 * current class constructor. this can be passed as an argument in the method
	 * call. this can be passed as argument in the constructor call. this can be
	 * used to return the current class instance from the method.
	 * 
	 * The this keyword can be used to refer current class instance variable If
	 * there is ambiguity between the instance variables and parameters, this
	 * keyword resolves the problem of ambiguity.
	 * 
	 */
	
	
	 
		public static void main(String args[]){  
		Studen s1=new Studen(111,"ankit",5000f);  
		Studen s2=new Studen(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
}
}

/*
 * 
 * If local variables(formal arguments) and instance variables are different, 
 * there is no need to use this keyword like in the following program:
 * 
 * 
 * class Student{  
int rollno;  
String name;  
float fee;  
Student(int r,String n,float f){  
rollno=r;  
name=n;  
fee=f;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis3{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
 * 
*/


