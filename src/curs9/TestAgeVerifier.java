package curs9;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) {

		AgeVerifier ageVerifier = new AgeVerifier();
		System.out.print("Please enter your age: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		try {
			
			ageVerifier.checkAgeLimit(age);
			
		} catch(MyCustomException e){
			System.out.println("you must be 18 to vote");
			e.printStackTrace();
		}
		
	}

}
