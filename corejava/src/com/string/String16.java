package com.string;

import java.util.Scanner;

public class String16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String str = sc.nextLine();

		String[] words = str.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {

			String reverse = "";

			for (int j = words[i].length() - 1; j >= 0; j--) {
				reverse = reverse + words[i].charAt(j);
			}

			result = result + reverse + " ";
		}

		System.out.println("Result: " + result.trim());

		sc.close();
	}
}
