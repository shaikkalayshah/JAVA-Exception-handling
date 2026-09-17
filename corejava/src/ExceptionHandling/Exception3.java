package ExceptionHandling;

import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter total price: ");
			String priceString = sc.nextLine();

			System.out.print("Enter number of products: ");
			String productString = sc.nextLine();

			int totalPrice = Integer.parseInt(priceString);
			int products = Integer.parseInt(productString);

			int pricePerProduct = totalPrice / products;
			System.out.println("Price per product = " + pricePerProduct);

			int[] prices = { 100, 200, 300, 400, 500 };

			System.out.print("Enter price index: ");
			int index = sc.nextInt();

			System.out.println("Selected price = " + prices[index]);

		} catch (NumberFormatException e) {
			System.out.println("Invalid input! Enter numbers only.");
		} catch (ArithmeticException e) {
			System.out.println("Number of products cannot be zero.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid price index.");
		}

		sc.close();
	}
}