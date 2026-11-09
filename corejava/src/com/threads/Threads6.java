package com.threads;

class Subject extends Thread {

    String subjectName;
    int marks;

    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public void run() {

        System.out.println("Subject: " + subjectName);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");

    }
}

public class Threads6 {

    public static void main(String[] args) {

        Subject s1 = new Subject("Maths", 85);
        Subject s2 = new Subject("Java", 90);
        Subject s3 = new Subject("Python", 95);

        s1.start();
        s2.start();
        s3.start();

    }
}
