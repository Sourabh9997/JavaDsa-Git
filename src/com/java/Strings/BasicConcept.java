package com.java.Strings;

public class BasicConcept {
public static void main(String[] args) {
	
	
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<26;i++) 
	{
		char ch=(char)('a'+i);
		//System.out.println(ch);
		//series=series + ch;  Not optimized solution O(n^2) complexity--> Thats why we need Stringbuildder class
		
		sb.append(ch);
	}
	System.out.println(sb.toString());
}
}
