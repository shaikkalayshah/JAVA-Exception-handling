package ExceptionHandling;

import java.util.Scanner;

public class Exception4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter total salary: ");
			String salaryString = sc.nextLine();

			System.out.print("Enter number of employees: ");
			String employeeString = sc.nextLine();

			int salary = Integer.parseInt(salaryString);
			int employees = Integer.parseInt(employeeString);

			int averageSalary = salary / employees;
			System.out.println("Average salary = " + averageSalary);

			int[] employeeSalaries = { 25000, 30000, 35000, 40000, 45000 };

			System.out.print("Enter employee index: ");
			int index = sc.nextInt();

			System.out.println("Employee salary = " + employeeSalaries[index]);

		} catch (NumberFormatException e) {
			System.out.println("Invalid salary or employee count!");
		} catch (ArithmeticException e) {
			System.out.println("Number of employees cannot be zero!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Employee index does not exist!");
		}

		sc.close();
	}
}