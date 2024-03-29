package com.java.Generics;
import java.util.*;
public class GenericTest {
	//creating a method that accepts only child class of Shape  
	public static void drawShapes(List<? extends Shape> lists){  
	for(Shape s:lists){  
	s.draw();//calling method of Shape class by child class instance  
	}  
	}  
	public static void main(String args[]){  
	List<Rectangle> list1=new ArrayList<Rectangle>();  
	list1.add(new Rectangle());  
	  
	List<Circle> list2=new ArrayList<Circle>();  
	list2.add(new Circle());  
	list2.add(new Circle());  
	  
	drawShapes(list1);  
	drawShapes(list2);  
	
	
	// Wildcard concept
//	The ? (question mark) symbol represents the wildcard element. It means any type. If we write <? extends Number>, it means any child class of Number, e.g., Integer, Float, and double. Now we can call the method of Number class through any child class object.
//
//			We can use a wildcard as a type of a parameter, field, return type, or local variable. However, it is not allowed to use a wildcard as a type argument for a generic method invocation, a generic class instance creation, or a supertype.
	}
}