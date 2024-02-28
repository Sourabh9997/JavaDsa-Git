package com.java.Generics;
import java.util.*;
public class UnboundedWildcard {
// Use Case
//	When the given method is implemented by using the functionality provided in the Object class.
//	When the generic class contains the methods that don't depend on the type parameter.
	   public static void display(List<?> list)  
	    {  
	          
	        for(Object o:list)  
	        {  
	            System.out.println(o);  
	        }  
	          
	    }  
	      
	      
	    public static void main(String[] args) {  
	          
	    List<Integer> l1=Arrays.asList(1,2,3);  
	    System.out.println("displaying the Integer values");  
	    display(l1);  
	    List<String> l2=Arrays.asList("One","Two","Three");  
	      System.out.println("displaying the String values");  
	        display(l2);  
	    }  
	
}
