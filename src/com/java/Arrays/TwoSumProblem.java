package com.java.Arrays;

public class TwoSumProblem {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		int sum=50;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				//j=20 i=10
				//logic a+B=c
				//a=c-b
				if(array[j]==sum-array[i]) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
		}

	}

}
