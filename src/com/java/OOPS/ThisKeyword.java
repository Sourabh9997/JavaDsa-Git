package com.java.OOPS;

public class ThisKeyword {

	/*
	 * You may invoke the method of the current class by using the this keyword. 
	 * If you don't use the this keyword, compiler automatically adds this keyword while invoking the method. 
	 * Let's see the example
	 * 
	 * 
	 * 
	 * class A{  
       void m(){System.out.println("hello m");}  
       void n(){  
System.out.println("hello n");  
//m();//same as this.m()  
this.m();  
}  
}  
class TestThis4{  
public static void main(String args[]){  
A a=new A();  
a.n();  
}}  
	 */
	

/*
 * class A{  
A(){  
this(5);  
System.out.println("hello a");  
}  
A(int x){  
System.out.println(x);  
}  
}  
class TestThis6{  
public static void main(String args[]){  
A a=new A();  
}}  
*/



/*class A{  
A(){System.out.println("hello a");}  
A(int x){  
this();  
System.out.println(x);  
}  
}  
class TestThis5{  
public static void main(String args[]){  
A a=new A(10);  
}}  */

/*The this() constructor call can be used to invoke the current class constructor. 
 * It is used to reuse the constructor. In other words, it is used for constructor chaining.
 * 
 */

 
 }
 

