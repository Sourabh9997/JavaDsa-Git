package com.java.Basicprograms;

public class CountingNoOfTimesADIgit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int no=34456;
		while(no>0) {
			int rem=no%10;
			if(rem==4) {
				count++;
			}
			no=no/10;
			
		}
		System.out.println(count);

	}

}
