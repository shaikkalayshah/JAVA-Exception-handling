package ExceptionHandling;

import java.util.Scanner;

class InvalidPasswordException extends Exception{
	InvalidPasswordException(String message){
		super(message);
	}
}

public class Exception10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the password : ");
		String password = sc.nextLine();
		
		try {
			if(password.length()<8) {
				throw new InvalidPasswordException ("Invaild password it must contain 8 characters") ;
			}
			System.out.println("Password is accepted.");
		}catch (InvalidPasswordException e){
			System.out.println(e.getMessage());
		}
			sc.close();
	}

}
