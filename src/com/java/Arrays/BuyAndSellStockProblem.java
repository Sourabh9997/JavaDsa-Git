package com.java.Arrays;

public class BuyAndSellStockProblem {

	public static void main(String[] args) {
		int array[]= {10,20,30,50,100};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
				
			}
			if(array[i]-min>max) {
				max=array[i]-min;
			}
			
		}
		System.out.println(max);

	}

}
