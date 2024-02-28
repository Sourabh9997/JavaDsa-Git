package com.java.OOPS;

public class CallByValue2 {
	/*
	 * 
	 * 
	 * In case of call by reference original value is changed if we made changes in
	 * the called method. If we pass object in place of any primitive value,
	 * original value will be changed. In this example we are passing object as a
	 * value. Let's take a simple example:
	 * 
	 * 
	 */
	
	int data=50;  
	  
	 void change(CallByValue2 op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 CallByValue2 op=new CallByValue2();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  
}
