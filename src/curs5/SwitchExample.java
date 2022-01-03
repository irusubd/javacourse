package curs5;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		/**
		 * Intrebam utilizator ce nota a obtinut
		 * pe baza notei intoarcem un mesaj:
		 * A: felicitari
		 * B: destul de bine
		 * C: suficient
		 * D: insuficient
		 * daca introduce alta nota printam: introdu nota valida
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nota: ");
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {
		case "A" : 
			System.out.println("felicitari");
			break;
		case "B" :
			System.out.println("destul de bine");
			break;
		case "C" :
			System.out.println("suficient");
			break;
		case "D" :
			System.out.println("insuficient");
			break;
		default :
			System.out.println("introdu nota valida");
		}
		
	}

}
