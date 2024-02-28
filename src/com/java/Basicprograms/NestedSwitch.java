package com.java.Basicprograms;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int empid=s.nextInt();
		String department=s.next();
		switch(empid) {
		case 1:
			System.out.println("Sourabh");
			break;
		case 2:
			System.out.println("Niks");
			break;
			
		case 3:
			System.out.println("Emp 3");
			switch(department) {
			case "IT" :
				System.out.println("IT here");
				break;
				
			case "Mech." :
				System.out.println("Mechanical");
				break;
			default :
				System.out.println("Dept daal chote");
			}
			break;
			
			default :
				System.out.println("Enter correct empId");
				
		}
	


	}

}
