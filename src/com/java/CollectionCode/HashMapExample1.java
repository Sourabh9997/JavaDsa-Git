package com.java.CollectionCode;
import java.util.*;
public class HashMapExample1 {
	 public static void main(String args[]){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
			//Doest not have duplicate keys, If u insert it will replace the vale with new value
			
		}
		}  
}
