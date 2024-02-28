package com.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String[] colors = { "red", "green", "blacl" };
		// Method 1
		List list = Arrays.asList(colors);
		//System.out.println(list);
		
		// Second way 
		List<String> l = new ArrayList<>();
		//Collections.addAll(l, colors);
		//System.out.println(l);
		
		//Third way
		System.out.println("Print using Arrays.aslist" + Arrays.asList(colors));
		
		// Its limitation- Doesnt work with primitives data types
		
		for (String string : colors) {
			l.add(string);
			
		}
		System.out.println(l);
		
		//4th way-Using Arrays.toString() Method
		System.out.println("Using toString()" + Arrays.toString(colors));
		
		int [][] twoD = new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.deepToString(twoD));
		
		Arrays.asList(list).stream().forEach(s->System.out.println(list));

	}
}
