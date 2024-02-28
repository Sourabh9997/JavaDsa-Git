package com.java.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 10, 1, 20, 100, 20 };
		int searchelement = 100;
		int index = binaraySearch(a, 0, a.length - 1, searchelement);
		System.out.println("Element found at index = " + index);

	}

	static int binaraySearch(int[] a, int low, int high, int searchelement) {
		if (high >= low) {
			int mid = low + ((high - low) / 2);
			if (a[mid] == searchelement) {
				return mid;

			}
			if (searchelement > a[mid]) {
				return binaraySearch(a, mid + 1, high, searchelement);
			}
			if (searchelement < a[mid]) {
				return binaraySearch(a, low, mid - 1, searchelement);
			}
		}
		return -1;
	}

}
