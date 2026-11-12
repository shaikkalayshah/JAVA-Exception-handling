package com.threads;

class NumberPrinter {

    int num = 1;

    synchronized void printOdd() {

        while (num <= 20) {

            while (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (num <= 20) {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }

    synchronized void printEven() {

        while (num <= 20) {

            while (num % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (num <= 20) {
                System.out.print(num + " ");
                num++;
                notify();
            }
        }
    }
}

public class Threads8 {
    public static void main(String[] args) {

        NumberPrinter obj = new NumberPrinter();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}
