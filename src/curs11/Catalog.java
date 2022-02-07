package curs11;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> catalog = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String nume = "notNull";
		int nota;

		while (true) {

			System.out.print("Cum te cheama? ");
			nume = scanner.next();
			
			//TBD cum trimit emptyline sau space in consola eclipse? :-)
			if(nume.isEmpty()) {
				break;
			}

			System.out.print("Ce nota ai luat? ");
			nota = scanner.nextInt();

			if (!catalog.containsKey(nume)) {

				catalog.put(nume, nota);
				System.out.println("Nu aveai nota, ti-am trecut acum!");
			} else {
				if (nota <= catalog.get(nume)) {
					System.out.println("Nu ai nevoie de alta nota.");
				} else {
					System.out.println("Felicitari pentru marire!");
					catalog.put(nume, nota);
				}
			}
			
			System.out.println("====================");
			System.out.println("Catalog:\n" + catalog);
			System.out.println("====================\n");

		}

	}

}
