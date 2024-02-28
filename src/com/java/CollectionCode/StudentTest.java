package com.java.CollectionCode;
import java.util.*;
public class StudentTest {
	public static void main(String[] args) {  
	      ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("Viru"));  
	      al.add(new Student("Saurav"));  
	      al.add(new Student("Mukesh"));  
	      al.add(new Student("Tahir"));  
	      
//	      al.add(new Student(101,"Vijay",23));  
//	      al.add(new Student(106,"Ajay",27));  
//	      al.add(new Student(105,"Jai",21));  
	        
	      
	    Collections.sort(al);  
	    for (Student s : al) {  
	      System.out.println(s.name);  
	    }  
	    // Comparable topic is going on here
	    
//	    Collections.sort(al);  
//	    for(Student st:al){  
//	    System.out.println(st.rollno+" "+st.name+" "+st.age);  
//	    }  
	  }  
}
