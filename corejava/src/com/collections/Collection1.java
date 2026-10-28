package com.collections;
import java.util.ArrayList;

public class Collection1 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Farhana");
        students.add("Bittu");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}