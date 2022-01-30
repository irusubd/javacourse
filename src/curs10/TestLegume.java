package curs10;

import java.io.IOException;
import java.util.Scanner;

public class TestLegume {

	public static void main(String[] args) throws IOException {

		Stoc stoc = new Stoc();
		Scanner scanner = new Scanner(System.in);
		String leguma;
		boolean hit = false;

		while (hit == false) {
			System.out.println("Ce leguma ai vrea sa cumperi?");
			leguma = scanner.next();

			if (stoc.isStoc(leguma)) {
				Legume legume = new Legume();
				System.out.println("Leguma " + leguma + " are " + legume.getCalorii(leguma) + " calorii");
				hit = true;
			} else {
				System.out.println("Nu vindem aceasta leguma!");
			}

		}

	}

}
