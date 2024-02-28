package com.java.CollectionCode;

import java.util.*;

public class Java8Comparator {
	public static void main(String args[]) {
		ArrayList<StudentJava8Comparator> al = new ArrayList<StudentJava8Comparator>();
		al.add(new StudentJava8Comparator(101, "Vijay", 23));
		al.add(new StudentJava8Comparator(106, "Ajay", 27));
		al.add(new StudentJava8Comparator(105, "Jai", 21));
		al.add(new StudentJava8Comparator(105,null,21)); 
		// Sorting elements on the basis of name
		Comparator<StudentJava8Comparator> cm1 = Comparator.comparing(StudentJava8Comparator::getName);
		Collections.sort(al, cm1);
		System.out.println("Sorting by Name");
		for (StudentJava8Comparator st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		// Sorting elements on the basis of age
		Comparator<StudentJava8Comparator> cm2 = Comparator.comparing(StudentJava8Comparator::getAge);
		Collections.sort(al, cm2);
		System.out.println("Sorting by Age");
		for (StudentJava8Comparator st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		// New Methods
		Comparator<StudentJava8Comparator> cm3=Comparator.comparing(StudentJava8Comparator::getName,Comparator.nullsFirst(String::compareTo));  
		  Collections.sort(al,cm3);  
		  System.out.println("Considers null to be less than non-null");  
		  for(StudentJava8Comparator st: al){  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     }  
	}
}
