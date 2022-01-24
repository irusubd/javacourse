package curs9;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {

		// useless catch
		try {

			Scanner scan = new Scanner(System.in);
			System.out.print("Introdu un numar: ");
			int num1 = scan.nextInt();
			System.out.print("Introdu alt numar: ");
			int num2 = scan.nextInt();

			System.out.println(num1 / num2);

		} catch (NullPointerException e) {
			System.out.println("Catch block");
			e.printStackTrace();
		}

	}

}
