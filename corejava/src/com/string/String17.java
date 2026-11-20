package com.string;

import java.util.Scanner;

public class String17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String str = sc.nextLine();

		String[] words = str.trim().split("\\s+");

		String result = "";

		for (int i = words.length - 1; i >= 0; i--) {
			result = result + words[i] + " ";
		}

		System.out.println("Reversed words: " + result.trim());

		sc.close();
	}
}
