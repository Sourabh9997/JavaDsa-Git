package com.java.Streams;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
	/*
	 * 
	 * 
	 * This method takes a sequence of input elements and combines them into a
	 * single summary result by repeated operation. For example, finding the sum of
	 * numbers, or accumulating elements into a list.
	 * 
	 * In the following example, we are using reduce() method, which is used to sum
	 * of all the product prices.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); // accumulating
																											// price, by
																											// referring
																											// method of
																											// Float
																											// class
		System.out.println(totalPrice2);
	}
	
	/*
	 * import java.util.stream.*;  
public class JavaStreamExample {  
    public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
    }  
} 
	 * 
	 * 
	 */
	
	
	/*
	 * Java Stream Example: Sum by using Collectors Methods
We can also use collectors to compute sum of numeric values. In the following example, we are using Collectors class and it?s specified methods to compute sum of all the product prices.

import java.util.*;  
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
          
    }  
}  
Output:

201000.0
	 * 
	 */
}
