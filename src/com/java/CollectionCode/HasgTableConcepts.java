package com.java.CollectionCode;
import java.util.*;
public class HasgTableConcepts {

//A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
//Java Hashtable class contains unique elements.
//Java Hashtable class doesn't allow null key or value.
//Java Hashtable class is synchronized.
//The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
//
	
	  public static void main(String args[]) {  
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
		     map.put(100,"Amit");    
		     map.put(102,"Ravi");   
		     map.put(101,"Vijay");    
		     map.put(103,"Rahul");    
		     System.out.println("Before remove: "+ map);    
		       // Remove value for key 102  
		       map.remove(102);  
		       System.out.println("After remove: "+ map);  
		       
		       //Here, we specify the if and else statement as arguments of the method  
		       System.out.println(map.getOrDefault(101, "Not Found"));  
		       System.out.println(map.getOrDefault(105, "Not Found")); 
		       
		       // Some More
		       System.out.println("Initial Map: "+map);  
		       //Inserts, as the specified pair is unique  
		       map.putIfAbsent(104,"Gaurav");  
		       System.out.println("Updated Map: "+map);  
		       //Returns the current value, as the specified pair already exist  
		       map.putIfAbsent(101,"Vijay");  
		       System.out.println("Updated Map: "+map);  


		   }      	
}
