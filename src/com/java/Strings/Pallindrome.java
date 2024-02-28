package com.java.Strings;

public class Pallindrome {
	public static void main(String[] args) {
		String s="aba";
		
		System.out.println(isPallin(s));
		
		int i=0;
		int j=s.length()-1;
		boolean flag= true; // Pallindrome
		
		while(i<j) {
			if(s.charAt(i)!= s.charAt(j)) {
				flag=false;
				break;
			}
			i++;
			j--;
			
		}
		if(flag==true) {
			System.out.println("Palli Mil gya");
		}else {
			System.out.println("Na mila");
		}
		
	}
	
	
	static boolean isPallin(String s) {
		if(s==null||s.length()==0) {
			return true;
		}
		for(int i=0;i<s.length()/2;i++) {
			char start=s.charAt(i);
			char end =s.charAt(s.length()-1);
			if(start!= end) {
				return false;
			}
		}
		return true;
		
	}

}
