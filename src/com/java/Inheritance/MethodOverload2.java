package com.java.Inheritance;

public class MethodOverload2 {
//Example of Method Overloading with Type Promotion if matching found
	/*
	 * 
	 * If there are matching type arguments in the method, type promotion is not performed.
	 * 
	 * class OverloadingCalculation2{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation2 obj=new OverloadingCalculation2();  
  obj.sum(20,20);//now int arg sum() method gets invoked  
  }  
}  
	 * 
	 * Example of Method Overloading with Type Promotion in case of ambiguity
	 * 
	 * If there are no matching type arguments in the method, 
	 * and each method promotes similar number of arguments, there will be ambiguity.
	 * 
	 * 
	 * class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);//now ambiguity  
  }  
}  
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
