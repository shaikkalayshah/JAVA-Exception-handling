package com.threads;

import java.util.Scanner;

class TableThread extends Thread {

    int num;

    TableThread(int num) {
        this.num = num;
    }

    public void run() {

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));

        }
    }
}

public class Threads4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        TableThread t1 = new TableThread(n);

        t1.start();

        sc.close();
    }
}
