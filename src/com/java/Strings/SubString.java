package com.java.Strings;

public class SubString {

	public static void main(String[] args) {
//		// Print all the substring of a given String S
//		Substring--> Concept---> S.subString(0,3)-> Oindex included and 3rd index excluded
//		S.subString(0);----> 0 se aage k saare elements print
		
		String str="abcd";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.print(str.substring(i, j) + " ");
			}
		}

	}

}
