package com.string;
import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; ; i++) {
            try {
                str.charAt(i);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        System.out.println("Length of string: " + count);

        sc.close();
    }
}
