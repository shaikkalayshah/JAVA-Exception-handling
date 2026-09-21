package com.patterns;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			System.out.print("*"+" ");
		}
	}

}
