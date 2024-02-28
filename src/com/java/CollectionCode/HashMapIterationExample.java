package com.java.CollectionCode;
import java.util.*;
public class HashMapIterationExample {
	public static void main(String[] args) {
		
		//Way-1
		HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
		
		hm.put(120,"Prateek");  
		hm.put(130, "Davesh");    
		hm.put(140, "Kamal");  
		hm.put(150, "Pawan");  
		Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
		while(it.hasNext())  
		{  
		int key=(int)it.next();  
		System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
		}  
		
		//way 2
		Map<String,String> map = new HashMap<String,String>();   
		map.put("Gujarat", "Gandhi Nagar");               
		map.put("Uttar Pradesh", "Lucknow");   
		map.put("Sikkim", "Ganagtok");   
		for (String State : map.keySet())   //using keyset() method for iteration over keySet  
		System.out.println("State: " + State);   
		for (String Capital : map.values())         //using values() for iteration over keys  
		System.out.println("Capiatl: " + Capital);  
		
		
	// Way-3
		
		Map<String, Float> map2 = new HashMap<String, Float>();   
		map2.put("Cookies",  90.87f);  
		map2.put("Dry Fruits", 434.23f);   
		map2.put("Oats", 220.00f);   
		map2.put("Chocolate", 70.89f);   
		for (Map.Entry<String,Float> entry : map2.entrySet()) //using map.entrySet() for iteration  
		{  
		//returns keys and values respectively  
		System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		}   
		}   
		 
	
	
	
	}
	
	

