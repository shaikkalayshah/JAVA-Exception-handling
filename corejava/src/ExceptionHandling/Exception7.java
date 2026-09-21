package ExceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exception7 {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("input.txt");

			FileWriter writer = new FileWriter("output.txt");

			int data;

			while ((data = reader.read()) != -1) {
				writer.write(data);
			}

			reader.close();
			writer.close();

			System.out.println("Data copied successfully");

		} catch (IOException e) {

			System.out.println("File error occurred");
			System.out.println(e.getMessage());

		} finally {

			System.out.println("File operation completed");
		}
	}
}