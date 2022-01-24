package curs9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println(readFile());
		System.out.println("Print dupa metoda readFile()");

	}

	public static String readFile() {

		try {
			Scanner file = new Scanner(new File("text.txt"));
			return file.nextLine();
		} catch (FileNotFoundException e) {
			System.out.println("Nu am gasit fisier");
		}
		return null;
	}

}
