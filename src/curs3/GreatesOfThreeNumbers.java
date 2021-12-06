package curs3;

import java.util.Scanner;

public class GreatesOfThreeNumbers {
	
	int number1;
	int number2;
	int number3;
	
	//metoda care intreaba
	public void askTheUserForThreeNumbers() {
		System.out.print("Please enter the first number: ");
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		
		System.out.print("Please enter the second number: ");
		number2 = scan.nextInt();
		
		System.out.print("Please enter the third number: ");
		number3 = scan.nextInt();
		
	}
	
	//metoda care compara
	public void compareThreeNumbers() {
		if(number1 > number2 && number1 > number3) {
			
			System.out.println("The first number is the greatest!");
		
		}else if(number2 > number1 && number2 > number3) {
			
			System.out.println("The second number is the greatest!");
			
		}else if(number3 > number1 && number3 > number2) {
			
			System.out.println("The third number is the greatest!");
			
		}else {
			System.out.println("Some of the numbers are equal!");
		}
	}

}
