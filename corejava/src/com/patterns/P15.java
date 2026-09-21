package com.patterns;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter number of cols : ");
		int col = sc.nextInt();
		char ch = 'a';
		int a = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i % 2 != 0) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print(a + " ");
					a++;
				}
			}
			System.out.println();

		}
	}

}
