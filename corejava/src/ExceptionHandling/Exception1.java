package ExceptionHandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter first number: ");
			String str1 = sc.nextLine();

			System.out.print("Enter second number: ");
			String str2 = sc.nextLine();

			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);

			int result = num1 / num2;

			System.out.println("Division Result: " + result);

			int[] numbers = { 10, 20, 30, 40, 50 };

			System.out.print("Enter array index: ");
			int index = sc.nextInt();

			System.out.println("Array Element: " + numbers[index]);

		}

		catch (NumberFormatException e) {
			System.out.println("Invalid number format. Please enter integers only.");
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index. Please enter an index from 0 to 4.");
		}

		sc.close();
	}
}
