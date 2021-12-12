package curs4;

import java.util.Scanner;

public class NumberMultiplier {

	public static void main(String[] args) {

		int myNumber;
		int result;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		myNumber = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			result = i * myNumber;
			System.out.println(myNumber + " x " + i + " = " + result);
		}

	}

}
