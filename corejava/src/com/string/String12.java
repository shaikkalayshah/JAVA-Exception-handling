package com.string;

public class String12 {
    public static void main(String[] args) {

        String[] words = {"madam", "hello", "civic"};

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reverse = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }

            if (word.equals(reverse)) {
                System.out.println(word + ": True");
            } else {
                System.out.println(word + ": False");
            }
        }
    }
}
