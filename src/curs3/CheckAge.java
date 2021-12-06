package curs3;

import java.util.Scanner;

public class CheckAge {
	
	int age;
	
	public void askUserAge() {
		System.out.print("Ce varsta ai? ");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
	}

	public void compareAgeInterval( ) {
		if (age < 18) {
			System.out.println("Esti minor!");
		} else if (age <= 65) {
			System.out.println("Esti adult!");			
		} else {
			System.out.println("Esti batran!");
		}
	}
}
