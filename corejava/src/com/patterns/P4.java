package com.patterns;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cols :");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			System.out.println("*");
		}
	}

}
