package curs5;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("first num: ");
		num1 = scan.nextInt();
		System.out.println("second num: ");
		num2 = scan.nextInt();
		System.out.println("operator: ");
		char operator = scan.next().charAt(0);
		int sum = 0;
		
		switch(operator) {
		case '+':
			sum = num1+num2;
			break;
		case '-':
			sum = num1-num2;
			break;
		case '/':
			sum = num1/num2;
			break;
		case '*':
			sum = num1*num2;
			break;
		default:
			System.out.println("wrong operator");
		}
		
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + sum);
		
	}

}
