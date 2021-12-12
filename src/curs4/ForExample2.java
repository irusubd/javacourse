package curs4;

import java.util.Scanner;

public class ForExample2 {

	//program care intreaba userul un caracter
	//mai intreaba un numar
	//va lua caracterul si va printa atatea linii si coloane cate sunt date in numar
	//char: *
	//nr: 4
	//****
	//****
	//****
	//****
	public static void main(String[] args) {
		char character;
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a char: ");
		character = scan.next().charAt(0);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();
		
		//linii
		for (int i=0; i<num; i++) {
			
			//caracter
			for(int j=0; j<num; j++) {
				System.out.print(character);
			}
			System.out.println();
		}

	}

}
