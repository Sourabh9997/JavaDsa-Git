package com.java.Java8;
//importing StringJoiner class  
import java.util.StringJoiner; 
public class StringJoinerConcept {
	  public static void main(String[] args) {  
	        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter     
	          
	        // Adding values to StringJoiner  
	        joinNames.add("Rahul");  
	        joinNames.add("Raju");  
	        joinNames.add("Peter");  
	        joinNames.add("Raheem");  
	                  
	        System.out.println(joinNames);  
	    }  
	  
	  /*
	   * import java.util.StringJoiner;  
public class StringJoinerExample {  
    public static void main(String[] args) {  
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  
    }  
}  
Output:

[Rahul,Raju,Peter,Raheem]
	   * 
	   * 
	   * 
	   */
}
