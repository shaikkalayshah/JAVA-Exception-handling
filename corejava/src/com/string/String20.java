package com.string;

import java.util.Scanner;

public class String20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String str = sc.nextLine().trim();

		int count = 0;

		if (!str.isEmpty()) {

			String[] words = str.split("\\s+");

			count = words.length;
		}

		System.out.println("Number of words: " + count);

		sc.close();
	}
}
