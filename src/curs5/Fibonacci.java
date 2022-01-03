package curs5;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {

		int numbers = 9;
		int a = 0;
		int b = 1;
		int sum;

		System.out.println("FOR " + numbers + " numbers");

		System.out.print(a + " " + b + " ");

		for (int i = 2; i < numbers; i++) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}
		
///////////////////////////////////////////////////////////

		System.out.println("\nWHILE " + numbers + " numbers");

		List<Integer> fibString = new ArrayList<Integer>();
		fibString.add(0);
		fibString.add(1);

		while (fibString.size() < numbers) {
			fibString.add(fibString.get(fibString.size() - 2) + fibString.get(fibString.size() - 1));
		}

		System.out.println(fibString.toString());

	}

}
