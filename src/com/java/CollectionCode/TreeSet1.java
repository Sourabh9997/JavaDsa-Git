package com.java.CollectionCode;
import java.util.*;
public class TreeSet1 {
	 public static void main(String args[]){  
		  //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("Traversing element through Iterator in descending order");  
	         Iterator i=al.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         } 
	         
	         TreeSet<Integer> set=new TreeSet<Integer>();    
	         set.add(24);    
	         set.add(66);    
	         set.add(12);    
	         set.add(15);    
	         System.out.println("Lowest Value: "+set.pollFirst());    
	         System.out.println("Highest Value: "+set.pollLast());   
	         
	         //TreeSet treeSet = new TreeSet();   
	        // Set syncrSet = Collections.synchronziedSet(treeSet);  
	         
	         // Navigable set operations
	         TreeSet<String> set1=new TreeSet<String>();  
	         set1.add("A");  
	         set1.add("B");  
	         set1.add("C");  
	         set1.add("D");  
	         set1.add("E");  
	         System.out.println("Initial Set: "+set1);  
	           
	         System.out.println("Reverse Set: "+set1.descendingSet());  
	           
	         System.out.println("Head Set: "+set1.headSet("C", true));  
	          
	         System.out.println("SubSet: "+set1.subSet("A", false, "E", true));  
	           
	         System.out.println("TailSet: "+set1.tailSet("C", false));  
	         
	         // Point-- If we add an object of the class that is not implementing the Comparable interface, the ClassCast Exception is raised. Observe the following program.
//	         it is required to implement a Comparable interface. It is because the TreeSet maintains the sorting order, and for doing the sorting the comparison of different objects that are being inserted in the TreeSet is must, which is accomplished by implementing the Comparable interface.
		 }  
}
