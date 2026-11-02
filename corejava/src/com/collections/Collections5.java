package com.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Collections5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a array size : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		System.out.println("Enter frist array : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter second array : ");
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Enter Third array : ");
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> result = new TreeSet<>();

		for (int num : a) {
			set1.add(num);
		}
		for (int num : b) {
			if (set1.contains(num)) {
				set2.add(num);
			}
		}
		for (int num : c) {
			if (set2.contains(num)) {
				result.add(num);
			}
		}
		System.out.println("Common elements : " + result);
	}
}
