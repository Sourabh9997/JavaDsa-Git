package com.java.Strings;

public class SubstringConcept {
	public static void main(String args[]) {
		String s = "SachinTendulkar";
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + s.substring(6));// Tendulkar
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // Sachin

		/*
		 * The split() method of String class can be used to extract a substring from a
		 * sentence. It accepts arguments in the form of a regular expression.
		 * 
		 * 
		 * 
		 * public class TestSubstring2  
{    
    /* Driver Code   
    public static void main(String args[])  
    {    
        String text= new String("Hello, My name is Sachin");  
         Splits the sentence by the delimeter passed as an argument   
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
    }  
} */   
	}
}
//startIndex: inclusive
//endIndex: exclusive

/*
In the above program, we have used the split() method. It accepts an argument \\.
 that checks a in the sentence and splits the string into another string. 
It is stored in an array of String objects sentences.
*/