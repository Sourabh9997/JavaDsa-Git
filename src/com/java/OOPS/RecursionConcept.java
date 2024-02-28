package com.java.OOPS;

public class RecursionConcept {

	/*
	 * Recursion in java is a process in which a method calls itself continuously. A
	 * method in java that calls itself is called recursive method.
	 * 
	 * It makes the code compact but complex to understand.
	 * 
	 * 
	 */

//	static void p(){  
//		System.out.println("hello");  
//		p();  
//		}  
//		  
//		public static void main(String[] args) {  
//		p();  
//		}  

	static int count = 0;

	static void p() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			p();
		}
	}

	public static void main(String[] args) {
		p();
	}
	
	/*
	 * public class RecursionExample3 {  
    static int factorial(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n * factorial(n-1));      
    }      
  
public static void main(String[] args) {  
System.out.println("Factorial of 5 is: "+factorial(5));  
}  
} 
	 * 
	 * 
	 * public class RecursionExample4 {  
    static int n1=0,n2=1,n3=0;      
     static void printFibo(int count){      
        if(count>0){      
             n3 = n1 + n2;      
             n1 = n2;      
             n2 = n3;      
             System.out.print(" "+n3);     
             printFibo(count-1);      
         }      
     }        
  
public static void main(String[] args) {  
    int count=15;      
      System.out.print(n1+" "+n2);//printing 0 and 1      
      printFibo(count-2);//n-2 because 2 numbers are already printed     
}  
}  
	 * 
	 * 
	 */
}

