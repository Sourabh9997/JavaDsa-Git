package com.java.ExceptionHandling;
import java.io.IOException;  
public class Testthrows1 {

	/*
	 * Let's see the example of Java throws clause which describes that checked
	 * exceptions can be propagated by throws keyword.
	 * 
	 * 
	 */
	
	
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   Testthrows1 obj=new Testthrows1();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	  
	  //Rule: If we are calling a method that declares an exception, we must either caught or declare the exception.
	  
	  /*
	   * There are two cases:

Case 1: We have caught the exception i.e. we have handled the exception using try/catch block.
Case 2: We have declared the exception i.e. specified throws keyword with the method.

	   * 
	   * In case we handle the exception, the code will be executed fine whether exception occurs during the program or not.
	   * 
	   * import java.io.*;  
	   * 
	   * 
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows2{  
   public static void main(String args[]){  
    try{  
     M m=new M();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
}  
exception handled
       normal flow...


	   */
}
