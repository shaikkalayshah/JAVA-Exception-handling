package ExceptionHandling;
import java.util.Scanner;

public class Exception6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        String[] transactions = {
            "Deposit 5000",
            "Withdraw 2000",
            "Deposit 1000"
        };

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Balance: Rs." + balance);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.print("\nEnter amount as String: ");
            String amount = sc.next();

            double value = Double.parseDouble(amount);

            System.out.println("Converted Amount: Rs." + value);

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a valid number");
        }

        try {
            System.out.print("\nEnter transaction index (0-2): ");
            int index = sc.nextInt();

            System.out.println("Transaction: " + transactions[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid transaction index");
        }

        try {
            String accountDetails = null;

            System.out.println("\nAccount Details:");
            System.out.println(accountDetails.length());

        } catch (NullPointerException e) {
            System.out.println("Error: Account details are null");
            System.out.println("Remaining balance:"+balance);
        }

        System.out.println("\nATM Program Completed");

        sc.close();
    }
}

