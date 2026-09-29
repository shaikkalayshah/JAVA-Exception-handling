package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String name = null;
            System.out.println("Length: " + name.length());

        } catch (NullPointerException e) {
            System.out.println("Error: String is null");
        }

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Age: " + age);

        } catch (InputMismatchException e) {
            System.out.println("Error: Enter a valid number for age");
            sc.nextLine();
        }

        try {
            int totalMarks = 450;
            int subjects = 0;

            int average = totalMarks / subjects;

            System.out.println("Average: " + average);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        try {
            int[] marks = {80, 75, 90, 85, 70};

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Marks: " + marks[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index");

        } finally {
            System.out.println("Student portal operations completed.");
        }

        sc.close();
    }
}