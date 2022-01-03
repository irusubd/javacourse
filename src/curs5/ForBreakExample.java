package curs5;

import java.util.Scanner;

public class ForBreakExample {

	public static void main(String[] args) {

		/**
		 * Luam un string si cautam o litera in stringul respectiv
		 * daca gasim litera iesim din program si printam : gasit
		 * daca nu o gasim printam : negasit
		 */
		
		System.out.println("enter text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		boolean letterFound = false;
		
		for(int i=0; i<text.length(); i++) {
			char currentLetter = text.charAt(i);
			System.out.println(i);
			if(currentLetter == letter) {
				letterFound = true;
				break;
			}
		}
		
		if(letterFound) {
			System.out.println("gasit!");
		}else {
			System.out.println("negasit!");
		}
		
	}

}
