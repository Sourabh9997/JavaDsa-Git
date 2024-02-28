package com.java.Basicprograms;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int sum=0;
		int original=num;
		while(num>0) {
			
			int rem=num%10;
			num=num/10;
			sum=sum+ rem*rem*rem;
			
		}
		if(sum==original) {
			System.out.println("Armstrong number ");
		}
		else {
			System.out.println(" Sorry bro !");
		}
		
	}

}
