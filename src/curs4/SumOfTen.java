package curs4;

import java.util.Scanner;

public class SumOfTen {

	public static void main(String[] args) {
		
		int result = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number #" + (i + 1) + ": ");
			result += scan.nextInt();
		}

		System.out.println("Sum is: " + result);

	}

}
