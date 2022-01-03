package curs5;

import java.util.Scanner;

public class ForVsWhile {

	/**
	 * Face un program care ii cere utilizatorului numere pe care le aduna userul
	 * introduce cate numere doreste el (fara limita) Cand vrea sa iasa din program
	 * utilizatorul va introduce 0
	 */
	public static void main(String[] args) {

		//rezolvareCuWhile();
		rezolvareCuFor();
	}

	// rezolvare while
	public static void rezolvareCuWhile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int x = scan.nextInt();
		int sum = 0;

		while (x != 0) {
			sum += x;
			System.out.println("Please enter a number :");
			x = scan.nextInt();
		}

		System.out.println("Total sum of entered numbers is :" + sum);
	}

	// rezolvare for
	public static void rezolvareCuFor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number :");
		
		int sum = 0;
		for(int x =scan.nextInt(); x!=0; x=scan.nextInt()) {
			sum+=x;
			System.out.println("Please enter a number: ");
		}
		
		System.out.println("Total sum of entered numbers is :" + sum);
		
	}

}
