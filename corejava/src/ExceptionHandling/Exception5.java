package ExceptionHandling;

import java.util.Scanner;

public class Exception5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter total distance: ");
			String distanceString = sc.nextLine();

			System.out.print("Enter number of days: ");
			String daysString = sc.nextLine();

			int distance = Integer.parseInt(distanceString);
			int days = Integer.parseInt(daysString);

			int distancePerDay = distance / days;
			System.out.println("Distance per day = " + distancePerDay);

			int[] distances = { 50, 100, 150, 200, 250 };

			System.out.print("Enter day index: ");
			int index = sc.nextInt();

			System.out.println("Distance on selected day = " + distances[index]);

		} catch (NumberFormatException e) {
			System.out.println("Invalid number! Please enter integers only.");
		} catch (ArithmeticException e) {
			System.out.println("Days cannot be zero!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid day index! Enter an index from 0 to 4.");
		}

		sc.close();
	}
}