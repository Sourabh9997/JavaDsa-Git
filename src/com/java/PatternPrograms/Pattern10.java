package com.java.PatternPrograms;

public class Pattern10 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){  
			for(int j=1;j<=i;j++){  
			        System.out.print("* ");  
			}  
			System.out.println();//new line  
			}  
		System.out.println("New One ");
		
		int term=6;  
		for(int i=1;i<=term;i++){  
		for(int j=term;j>=i;j--){  
		        System.out.print("* ");  
		}  
		System.out.println();//new line  
		}  


	}

}
