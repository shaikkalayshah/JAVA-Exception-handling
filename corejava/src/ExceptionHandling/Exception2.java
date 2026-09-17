package ExceptionHandling;
import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter total marks: ");
			String s1 = sc.nextLine();

			System.out.print("Enter number of students: ");
			String s2 = sc.nextLine();

			int marks = Integer.parseInt(s1);
			int students = Integer.parseInt(s2);

			int average = marks / students;
			System.out.println("Average marks = " + average);

			int[] marksArray = { 85, 90, 78, 92, 88 };

			System.out.print("Enter student index: ");
			int index = sc.nextInt();

			System.out.println("Student marks = " + marksArray[index]);

		} catch (NumberFormatException e) {
			System.out.println("Please enter valid numbers!");
		} catch (ArithmeticException e) {
			System.out.println("Number of students cannot be zero!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Student index is out of range!");
		}

		sc.close();
	}
}