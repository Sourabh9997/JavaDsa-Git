package com.java.Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] myarray = { 1,5,1,5,2,4 };
		Set myset = new HashSet();

		for (int i = 0; i < myarray.length; i++) {
			if (myset.contains(myarray[i])) {
				System.out.println("DuplicATE ELEMENT MIL GYE " + myarray[i]);

			} else
				myset.add(myarray[i]);
		}
// Bruteforce way
		
		System.out.println("Check out this way");
		for(int i=0;i<myarray.length;i++) {
			for(int j=i+1;j<myarray.length;j++) {
				if(myarray[i]==myarray[j]) {
					System.out.println("New way "  +myarray[i]);
				}
			}
		}
	}

}
