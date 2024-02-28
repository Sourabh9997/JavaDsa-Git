package com.java.Encapsulation;

public class Test {
	public static void main(String[] args){  
		//creating instance of the encapsulated class  
		Student s=new Student();  
		//setting value in the name member  
		s.setName("vijay");  
		//getting value of the name member  
		System.out.println(s.getName());  
		}  
}
/*
Read-Only class

//A Java class which has only getter methods.  
public class Student{  
//private data member  
private String college="AKG";  
//getter method for college  
public String getCollege(){  
return college;  
}  
}  
s.setCollege("KITE");//will render compile time error  



*/

/*
Write-Only class

//A Java class which has only setter methods.  
public class Student{  
//private data member  
private String college;  
//getter method for college  
public void setCollege(String college){  
this.college=college;  
}  
}  

Now, you can't get the value of the college, you can only change the value of college data member.

System.out.println(s.getCollege());//Compile Time Error, because there is no such method  
System.out.println(s.college);//Compile Time Error, because the college data member is private.   
//So, it can't be accessed from outside the class  

*/