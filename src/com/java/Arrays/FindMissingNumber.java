package com.java.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
	int a[]= {1,2,3,5,6};
	int missingnumber=findmissingnumber(a,6);
	System.out.println("missing number = " + missingnumber );
	
	}

	
	static int findmissingnumber(int a[],int n) {
		int actualsum=0;
		int expectedsum=(n*(n+1))/2;
		for (int i : a) {
			actualsum=actualsum+i;
			
		}
		return expectedsum-actualsum;
		
	}

}

