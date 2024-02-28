package com.java.Basicprograms;

import java.util.HashSet;
import java.util.Set;

public class Operators {
public static void main(String[] args) {
	int x=10;  
	System.out.println(x++);//10 (11)  
	System.out.println(++x);//12  
	System.out.println(x--);//12 (11)  
	System.out.println(--x);//10  
	
	// New Conditions 
	
	System.out.println("Hello There ? ");
	int a=10;  
	int b=10;  
	System.out.println(a++ + ++a);//10+12=22  
	System.out.println(b++ + b++);//10+11=21  
	
	System.out.println("Hello There  Again ? ");
	
	int c=10;  
	int d=-10;  
	boolean e=true;  
	boolean f=false;  
	System.out.println(~c);//-11 (minus of total positive value which starts from 0)  
	System.out.println(~d);//9 (positive of total minus, positive starts from 0)  
	System.out.println(!e);//false (opposite of boolean value)  
	System.out.println(!f);//true  
	
	System.out.println("Left Shift operator");
	
	
	System.out.println(10<<2);//10*2^2=10*4=40  
	System.out.println(10<<3);//10*2^3=10*8=80  
	System.out.println(20<<2);//20*2^2=20*4=80  
	System.out.println(15<<4);//15*2^4=15*16=240  
	
	
	
	System.out.println("Right Shift operator");
	
	System.out.println(10>>2);//10/2^2=10/4=2  
	System.out.println(20>>2);//20/2^2=20/4=5  
	System.out.println(20>>3);//20/2^3=20/8=2  
	
	System.out.println("ternary operator");
	
	int y=10;
	int z=5;
	int min=(x<z)?y:z;
	System.out.println(min);
	
	 y+=4;
	 System.out.println(y);
	
	Set<Integer> set= new HashSet<>();
	set.add(10);
	set.add(10);
	System.out.println(set.size());
}
}
