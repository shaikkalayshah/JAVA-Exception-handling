package com.threads;

class Employee extends Thread {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void run() {

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
        System.out.println("----------------------");

    }
}

public class Threads5 {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul", 25000);
        Employee e2 = new Employee(102, "Priya", 30000);
        Employee e3 = new Employee(103, "Arjun", 35000);

        e1.start();
        e2.start();
        e3.start();

    }
}
