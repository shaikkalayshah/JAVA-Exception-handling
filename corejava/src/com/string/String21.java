package com.string;

import java.util.Scanner;

public class String21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String result = str.replace(" ", "@");

        System.out.println("Result: " + result);

        sc.close();
    }
}
