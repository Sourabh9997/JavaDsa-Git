package com.java.Strings;

public class NoOfPallidromincStrings {

	public static boolean isPallindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;

			}
			i++;
			j--;

		}
		return true;
	}

	public static void main(String[] args) {
		String s= "abbd";
		int count =0;
		for(int i=0;i<s.length();i++) {
			for (int j=i+1;j<= s.length();j++) {
				if(isPallindrome(s.substring(i, j))== true) {
					System.out.print(s.substring(i, j) + " ");
					count++;
				}
			}
		}
		System.out.println(" \n No of Palli strings are " + count);

	}

}
