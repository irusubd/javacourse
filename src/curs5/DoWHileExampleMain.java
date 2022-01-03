package curs5;

import java.util.Scanner;

public class DoWHileExampleMain {

	public static void main(String[] args) {

		/**
		 * introducem numere si le inmultim cu 10
		 * printam rezultatul
		 * cand introducem 0 oprim executia
		 */
		
		int number;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("enter a number: ");
			number = scan.nextInt();
			System.out.println(number*10);
			
		}while(number != 0);
	}

}
