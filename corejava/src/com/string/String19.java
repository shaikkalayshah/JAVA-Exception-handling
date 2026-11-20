package com.string;

import java.util.Scanner;
import java.util.Arrays;

public class String19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String str1 = sc.nextLine().replace(" ", "").toLowerCase();

		System.out.println("Enter second string:");
		String str2 = sc.nextLine().replace(" ", "").toLowerCase();

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Both strings are Anagrams");
		} else {
			System.out.println("Both strings are Not Anagrams");
		}

		sc.close();
	}
}
