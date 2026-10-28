package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection3 {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(50);
		numbers.add(10);
		numbers.add(40);
		numbers.add(20);

		Collections.sort(numbers);

		System.out.println(numbers);
	}
}