package curs6;

import java.util.HashSet;

public class DuplicateNames {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// arrayul original
		String[] myStringArray = { "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion" };

		// set de uniques
		HashSet uniques = new HashSet();

		for (String s : myStringArray) {
			if (!uniques.add(s)) {
				System.out.println("Nume duplicat: " + s);
			}

		}

	}

}
