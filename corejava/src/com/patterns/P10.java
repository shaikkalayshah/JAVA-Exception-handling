package com.patterns;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter number of cols :");
		int col = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if ((i == 1 && j != 1 && j != col && j != col / 2 + 1)
						|| (i == row && j != 1 && j != col && j != col / 2 + 1)
						|| (j == 1 && i != 1 && i != row && i != row / 2 + 1)
						|| (j == col && i != 1 && i != row && i != row / 2 + 1)
						|| (i == row / 2 + 1 && j == col / 2 + 1)) {

					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
