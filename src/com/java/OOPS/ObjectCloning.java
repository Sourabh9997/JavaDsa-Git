package com.java.OOPS;

public class ObjectCloning implements Cloneable {

	
		@Override  
		protected Object clone() throws CloneNotSupportedException   
		{   
		//invokes the clone() method of the super class      
		return super.clone();   
		}   
		String str = "New Object Created";   
		public static void main(String[] args)   
		{  
		//creating an object of the class     
			ObjectCloning obj1 = new ObjectCloning();   
		//try catch block to catch the exception thrown by the method  
		try  
		{  
		//creating a new object of the obj1 suing the clone() method  
			ObjectCloning obj2 = (ObjectCloning) obj1.clone();   
		System.out.println(obj2.str);   
		}   
		catch (CloneNotSupportedException e)   
		{   
		e.printStackTrace();   
		}   
		  //protected Object clone() throws CloneNotSupportedException  
		//  ClassName newobject = (ClassName) oldobject.clone();  

	}

}
