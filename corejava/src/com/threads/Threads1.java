package com.threads;

class Student extends Thread {

    String name;
    double attendance;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public void run() {
        System.out.println("Student Name: " + name);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("-------------------");
    }
}

public class Threads1 {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 85.5);
        Student s2 = new Student("Priya", 92.0);
        Student s3 = new Student("Arjun", 78.5);

        s1.start();
        s2.start();
        s3.start();
    }
}
