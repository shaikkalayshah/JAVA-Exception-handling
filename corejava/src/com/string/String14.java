package com.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class String14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.println(map);

		sc.close();

	}

}
