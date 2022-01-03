package curs6;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		int max = 10;
		int sum = 0;
		int[] numbers = new int[max];

		System.out.println("Introdu 10 numere: ");

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < max; i++) {
			numbers[i] = scan.nextInt();
		}

		for (int nr : numbers) {
			sum += nr;
		}
		
		System.out.println("Suma numerelor din array este: " + sum);

	}

}
