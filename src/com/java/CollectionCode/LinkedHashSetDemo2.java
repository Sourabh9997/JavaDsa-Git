package com.java.CollectionCode;
import java.util.*;
public class LinkedHashSetDemo2 {
	  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public LinkedHashSetDemo2(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
	 
	 
	public static void main(String[] args) {  
	    LinkedHashSet<LinkedHashSetDemo2> hs=new LinkedHashSet<LinkedHashSetDemo2>();  
	    //Creating Books  
	    LinkedHashSetDemo2 b1=new LinkedHashSetDemo2(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    LinkedHashSetDemo2 b2=new LinkedHashSetDemo2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    LinkedHashSetDemo2 b3=new LinkedHashSetDemo2(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to hash table  
	    hs.add(b1);  
	    hs.add(b2);  
	    hs.add(b3);  
	    //Traversing hash table  
	    for(LinkedHashSetDemo2 b:hs){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
	}  


