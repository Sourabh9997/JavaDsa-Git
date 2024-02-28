package com.java.CollectionCode;
import java.util.*;
public class HashSetDemo {
	 
		public static void main(String[] args)  
		{  
		HashSet<String> hs= new HashSet<String>();  
		hs.add("India");  
		hs.add("America");  
		hs.add("Russia");  
		System.out.println(" Set is "+ hs);      //view HashSet  
		Iterator it=hs.iterator();               //add an iterator to hs  
		System.out.println("Elements using iterator:");  
		while(it.hasNext())                             //display elements by using iterator  
		{  
		String s=(String)it.next();  
		System.out.println(s);  
		}  
		}  
		//**************** Working of Add method of Set*********************
		
		
		
//		public class HashSet<E> extends AbstractSet<E>  
//		{  
//		private transient HashMap<E,Object> map;  
//		// Dummy value to associate with an Object in the backing Map  
//		private static final Object PRESENT = new Object();  
//		public HashSet()  
//		{  
//		map = new HashMap<>();  
//		}  
//		public boolean add(E e)   
//		{  
//		return map.put(e, PRESENT)==null;  
//		}  
//		}  
//		
//		In the above code a call to add(object) is delegated to put(key, value) internally. Where key is the object we have passed and the value is another object, called PRESENT. It is a constant in java.util.HashSet.
//
//		We are achieving uniqueness in Set internally through HashMap. When we create an object of HashSet, it will create an object of HashMap. We know that each key is unique in the HashMap. So, we pass the argument in the add(E e) method. Here, we need to associate some value to the key. It will associate with Dummy value that is (new Object()) which is referred by Object reference PRESENT.
//
//		When we add an element in HashSet like hs.add("India"), Java does internally is that it will put that element E here "India" as a key into the HashMap (generated during HashSet object creation). It will also put some dummy value that is Object's object is passed as a value to the key.
//If the Key is unique and added to the map, then it will return null
	//	If the Key is duplicate, then it will return the old value of the k
		
		
//		
//		When we invoke add() method in HashSet, Java internally checks the return value of map.put(key, value) method with the null value.
//				
//				public boolean add(E e)  
//		{  
//		return map.put(e, PRESENT==null);  
//		}  
}
