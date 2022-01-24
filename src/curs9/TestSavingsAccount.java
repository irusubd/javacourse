package curs9;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {

		Customer alex = new Customer("Alex", "BH 90210", "bitdefender@irusu.com");
		SavingsAccount cont = new SavingsAccount(12345, 5000.00, alex);

		System.out.println("Hi " + alex.getName() + ",");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the ammount to withdraw: ");
		int amount = scanner.nextInt();

		try {
			cont.withdraw(amount);
			System.out.println("Please take your money!");
			System.out.println("Your new balance is: " + cont.balance);
			System.out.println("Thank you for using our ATM!");
		} catch (Exception e) {
			System.out.println("The amount you entered is greater than the available balance: " + cont.balance);
			System.out.println("Thank you for using our ATM!");
		}

	}

}
