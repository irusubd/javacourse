package curs4;

import java.util.Scanner;

public class Calculator {
	
	/**
	 *  Calculator simplu
	 *  Intrebam nr 1
	 *  Intrebam operatia
	 *  Intrebam nr 2
	 *  Printam operatia si rezultat
	 *  
	 *  Ex: 2+3=5
	 */
	
	int num1;
	int num2;
	char operation;
	int result;
	
	/***
	 * intrebam utilizatorul valorile
	 */
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1 = scan.nextInt();
		
		System.out.print("Enter the operation: ");
		operation = scan.next().charAt(0);
		
		System.out.print("Enter the second number: ");
		num2 = scan.nextInt();
		
		
	}
	
	//calculam
	public void calculateValues() {
		
		if(operation == '+') {
			result = num1 + num2;
			printResult();
		}else if(operation == '-'){
			result = num1 - num2;
			printResult();
		}else if(operation == '*' || operation == 'x') {
			result = num1 * num2;
			printResult();
		}else if(operation == '/') {
			result = num1 / num2;
			printResult();
		}else {
			System.out.println("Wrong operation!");
		}
	}
	
	public void printResult() {
		System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
	}

	
	

}
