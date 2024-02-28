package com.java.Strings;

public class StringConcat {

	/* Driver Code */
	public static void main(String args[]) {
		StringBuilder s1 = new StringBuilder("Hello"); // String 1
		StringBuilder s2 = new StringBuilder(" World"); // String 2
		StringBuilder s = s1.append(s2); // String 3 to store the result
		System.out.println(s.toString()); // Displays result
		
		/*
		 * public class StrFormat  
{  
    /* Driver Code */  
   /* public static void main(String args[])  
    {  
        String s1 = new String("Hello");    //String 1  
        String s2 = new String(" World");    //String 2  
        String s = String.format("%s%s",s1,s2);   //String 3 to store the result  
            System.out.println(s.toString());  //Displays result  
    }  
}  */
		
		 
	/*	 public class StrJoin  
		 {  
		      Driver Code   
		     public static void main(String args[])  
		     {  
		         String s1 = new String("Hello");    //String 1  
		         String s2 = new String(" World");    //String 2  
		         String s = String.join("",s1,s2);   //String 3 to store the result  
		             System.out.println(s.toString());  //Displays result  
		     }  
		 } */ 
	}
}
