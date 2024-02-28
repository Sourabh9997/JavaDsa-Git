package com.java.Strings;

import java.util.Scanner;
import java.util.*;

public class ToggleUsingStringBuilder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		StringBuilder str=new StringBuilder(sc.nextLine());
		System.out.println(str);
		//toggle --- pHySics------>PhYsICS----- A--> 65 , a---> 97 ,o--48 --> Ascii values
		
		
		for(int i=0 ; i< str.length();i++) {
			boolean flag=true;
			char ch=str.charAt(i); //P
			if(ch==' ') {
				continue;
			}
			int asci=(int) ch; // Ascii value aagyi
			if(asci>=97) {
				flag=false;
			}
			if(flag==true) {
				asci+=32;
				char dh=(char) asci;
				str.setCharAt(i,dh);
				
			}
			else {
				asci-=32;
				char dh=(char) asci;
				str.setCharAt(i, dh);
			}
		}
		System.out.println(str);

	}

}
