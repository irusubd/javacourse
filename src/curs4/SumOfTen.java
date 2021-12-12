package curs4;

import java.util.Scanner;

public class SumOfTen {

	int[] tenNumbers = new int[10];
	int result;
	

	public void askUserForTenNumbers() {

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number #" + (i+1) + ": ");
			tenNumbers[i] = scan.nextInt();
		}

	}

	public void calculateSum() {
		
		for (int i = 0; i < 10; i++) {
			result += tenNumbers[i];
		}
	}
	
	public void printResult() {
		System.out.println("Sum is: " + result);
	}

}
