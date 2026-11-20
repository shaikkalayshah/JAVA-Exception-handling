package com.string;

import java.util.Scanner;

public class String15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String str = sc.nextLine();

		String[] words = str.split("\\s+");

		String longest = "";
		String secondLongest = "";

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > longest.length()) {

				secondLongest = longest;
				longest = words[i];

			} else if (words[i].length() > secondLongest.length() && !words[i].equals(longest)) {

				secondLongest = words[i];
			}
		}

		System.out.println("Longest: " + longest + " (" + longest.length() + ")");

		System.out.println("Second Longest: " + secondLongest + " (" + secondLongest.length() + ")");

		sc.close();
	}
}
