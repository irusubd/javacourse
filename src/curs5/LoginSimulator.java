package curs5;

import java.util.Scanner;

public class LoginSimulator {

	public static void main(String[] args) {
		
		String username = "TestUser";
		int password = 1234;
		int i = 0;
		String inputUser;
		int inputPass;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Enter a username: ");
			inputUser=scan.next();
			System.out.print("Enter a password: ");
			inputPass=scan.nextInt();
			
			if(inputUser.equals(username) && inputPass == password) {
				System.out.println("Login successful.");
				System.exit(0);
			} else {
				System.out.println("Login error!");
			}
			
			i++;
			
		} while (i <= 2);
		
		System.out.println("Maximum attempts reached. User blocked!");
		
	}

}