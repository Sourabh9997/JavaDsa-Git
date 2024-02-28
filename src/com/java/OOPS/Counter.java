package com.java.OOPS;

public class Counter {
	int count = 0;// will get memory each time when the instance is created

	Counter() {
		count++;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
		// Creating objects
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
}

/*
 * we have created an instance variable named count which is incremented in the
 * constructor. Since instance variable gets the memory at the time of object
 * creation, each object will have the copy of the instance variable. If it is
 * incremented, it won't reflect other objects. So each object will have the
 * value 1 in the count variable.
 * 
 * 
 * class Counter2{  
static int count=0;//will get memory only once and retain its value  
  
Counter2(){  
count++;//incrementing the value of static variable  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//creating objects  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  
}  
}  
As we have mentioned above, static variable will get the memory only once, 
if any object changes the value of the static variable, it will retain its value.
 */