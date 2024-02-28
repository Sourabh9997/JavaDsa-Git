package com.java.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MapReduceOperations {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Sum using IntStream
		int sum = list.stream().mapToInt(i -> i).sum();
		System.out.println("Sum is " + sum);

		// Sum Using MapReduce
		int sum2 = list.stream().reduce(0, (a, b) -> a + b);

		System.out.println(" New Sum is " + sum2);

		// Avg

		double average = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(" Average is " + average);

		// Print even
		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println("Even numbers " + x));

		// Numbers of even present

		int n = (int) list.stream().filter(x -> x % 2 == 0).count();
		System.out.println(n);

		// Reverse and Sort

		System.out.println("Reverse and Sort");
		list.stream().sorted().forEach(obj -> System.out.println(obj));
		// Reverse
		list.stream().sorted(Comparator.reverseOrder()).forEach(obj -> System.out.println(obj));
	}

}
