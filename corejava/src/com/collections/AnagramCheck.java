package com.collections;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String s1 = sc.nextLine();

		System.out.println("Enter second string:");
		String s2 = sc.nextLine();

		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
		}else {
			char[]a = s1.toCharArray();
			char[]b = s2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			if(Arrays.equals(a,b)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}

		}
	}
}
