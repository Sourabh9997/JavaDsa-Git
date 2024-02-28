package com.java.CollectionCode;
import java.util.*;
public class CollectionSortDemo {

	
	//String objects
	public static void main(String args[]){  
		  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		System.out.println("Reverse order");
		
		  Collections.sort(al,Collections.reverseOrder());  
	        Iterator i=al.iterator();  
	        while(i.hasNext())  
	        {  
	            System.out.println(i.next());  
	        }  
		
	        
	        
	        System.out.println("// Wrapper class objects");
	        ArrayList al1=new ArrayList();  
	        al1.add(Integer.valueOf(201));  
	        al1.add(Integer.valueOf(101));  
	        al1.add(230);//internally will be converted into objects as Integer.valueOf(230)  
	          
	        Collections.sort(al1);  
	          
	        Iterator itr1=al1.iterator();  
	        while(itr.hasNext()){  
	        System.out.println(itr.next());  
	         }  
	        
	        
		}  
	
	
	
	
	
	
}
