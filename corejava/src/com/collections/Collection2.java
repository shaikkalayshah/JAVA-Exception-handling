package com.collections;
import java.util.ArrayList;

public class Collection2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.remove(Integer.valueOf(20));

        System.out.println(numbers);
        System.out.println(numbers.contains(30));
    }
}