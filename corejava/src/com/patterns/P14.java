package com.patterns;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter number of cols :");
		int col = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == 1 || i == row || j == 1 || j == col || i == j || i + j == row + 1){
					if(j%2!=0) {
						System.out.print("1"+" ");
					}else {
						System.out.print("0"+" ");
					}
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}

}
