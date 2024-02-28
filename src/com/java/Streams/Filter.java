package com.java.Streams;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	/*
	 * 
	 * Java stream provides a method filter() to filter stream elements on the basis
	 * of given predicate. Suppose you want to get only even elements of your list
	 * then you can do this easily with the help of filter method.
	 * 
	 * This method takes predicate as an argument and returns a stream of consisting
	 * of resulted elements.
	 * 
	 */
	
	   public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        productsList.stream()  
	                    .filter(p ->p.price> 30000)   // filtering price  
	                    .map(pm ->pm.price)          // fetching price  
	                    .forEach(System.out::println);  // iterating price  
	    }  
}
