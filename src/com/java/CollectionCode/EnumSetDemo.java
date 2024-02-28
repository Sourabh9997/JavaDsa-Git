package com.java.CollectionCode;
import java.util.*;
public class EnumSetDemo {
	enum days {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		}  
		  
		  public static void main(String[] args) {  
		    Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
		    // Traversing elements  
		    Iterator<days> iter = set.iterator();  
		    while (iter.hasNext())  
		      System.out.println(iter.next());  
		    // Some more Methods
		    
		    Set<days> set1 = EnumSet.allOf(days.class);  
		      System.out.println("Week Days:"+set1);  
		      Set<days> set2 = EnumSet.noneOf(days.class);  
		      System.out.println("Week Days:"+set2);     
		  }  

}