package curs4;

import java.util.Scanner;

public class ConditionalOperatorExample {
	
	/**
	 * Program care citeste 2 numere de la tastatura
	 * Verifica daca fiecare numar este pozitiv
	 * Verifica daca ambele numere sunt pozitive
	 * Verifica care este cel mai mic numar
	 * 
	 */

	public static void main(String[] args) {

		int num1;
		int num2;
		//intrebam 2 numere
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1 = scan.nextInt();
		System.out.print("Enter second number: ");
		num2 = scan.nextInt();
		
		//verific daca primul este pozitiv
		if(num1 > 0) {
			System.out.println("Num1 este pozitiv");
		}else {
			System.out.println("Num1 este negativ");
		}
		
		//resp = num1 > 0 ? "Num1 este pozitiv" : "Num1 este negativ";
		
		//verific daca al doilea este pozitiv
		if(num2 > 0) {
			System.out.println("Num2 este pozitiv");
		}else {
			System.out.println("Num2 este negativ");
		}
		
		//resp = num2 > 0 ? "Num2 este pozitiv" : "Num2 este negativ";

		//verific daca ambele sunt pozitive
		if(num1>0 && num2>0) {
			System.out.println("Ambele sunt pozitive");
		}else {
			System.out.println("Nu sunt ambele pozitive");
		}
		
		//resp = (num1>0) && (num2>0) ? "Ambele sunt pozitive" :"Nu sunt ambele pozitive";
		
		//verific care este cel mai mic
		if(num1 < num2) {
			System.out.println("Num1 este cel mai mic");
		}else if(num1 == num2) {
			System.out.println("Numerele sunt egale");
		}else {
			System.out.println("Num2 este cel mai mic");
		}
		
		//resp = num1 == num2 ? "Numerele sunt egale" : num1<num2 ? "Num1 este cel mai mic" : "Num2 este cel mai mic";
		
		
		//ternary operator
		String resp;
		resp = num1 > 0 ? "Num1 este pozitiv" : "Num1 este negativ";
		System.out.println(resp);
		resp = num2 > 0 ? "Num2 este pozitiv" : "Num2 este negativ";
		System.out.println(resp);
		resp = (num1>0) && (num2>0) ? "Ambele sunt pozitive" :"Nu sunt ambele pozitive";
		System.out.println(resp);
		resp = num1 == num2 ? "Numerele sunt egale" : num1<num2 ? "Num1 este cel mai mic" : "Num2 este cel mai mic";
		System.out.println(resp);
	}

}
