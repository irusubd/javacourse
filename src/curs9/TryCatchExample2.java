package curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample2 {

	public static void main(String[] args) {

		try {

			Scanner scan = new Scanner(System.in);
			System.out.print("Introdu un numar: ");
			int num1 = scan.nextInt();
			System.out.print("Introdu alt numar: ");
			int num2 = scan.nextInt();
			System.out.println(num1 / num2);

		} catch (ArithmeticException e) {
			System.out.println("You should not divide by zero");
			System.out.println("Please try again: ");
			Scanner scan = new Scanner(System.in);
			System.out.print("Introdu un numar: ");
			int num1 = scan.nextInt();
			System.out.print("Introdu alt numar: ");
			int num2 = scan.nextInt();
			System.out.println(num1 / num2);
		} catch(Exception e) {
			System.out.println("Something went wrong!");
		}
		
	}

}
