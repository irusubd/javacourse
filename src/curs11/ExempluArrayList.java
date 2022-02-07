package curs11;

import java.util.ArrayList;
import java.util.List;

public class ExempluArrayList {

	public static void main(String[] args) {

		// Obiect arr[] new Obiect[6]

		List<String> list = new ArrayList<>();
		System.out.println(list.size());

		// add element to array list
		list.add("oana");
		list.add("ion");
		list.add("gabriel");
		list.add("maria");

		System.out.println("Print arrray list size:");
		System.out.print(list.size());

		list.add("carmen");

		System.out.print("Print arrray list size:");
		System.out.println(list.size());

		// get elements by index
		System.out.println("Get element at index: " + list.get(0));

		// display all elements
		for (String nume : list) {
			System.out.println(list.indexOf(nume) + ":" + nume);
		}

		System.out.println("------------------------------------------");

		System.out.print("Print arrray list size:");
		System.out.println(list.size());

		list.add(5, "tara");

		System.out.print("Print arrray list size:");
		System.out.println(list.size());

		// display all elements
		for (String nume : list) {
			System.out.println(list.indexOf(nume) + ":" + nume);
		}
		System.out.println("------------------------------------------");

		list.add("mara");

		// display all elements
		for (String nume : list) {
			System.out.println(list.indexOf(nume) + ":" + nume);
		}
		System.out.println("------------------------------------------");

		// remove
		list.remove("mara");
		list.remove(0);

		// display all elements
		for (String nume : list) {
			System.out.println(list.indexOf(nume) + ":" + nume);
		}
		System.out.println("------------------------------------------");

		// remove all elements
		list.clear();

		// display all elements
		for (String nume : list) {
			System.out.println(list.indexOf(nume) + ":" + nume);
		}
		System.out.println("------------------------------------------");

	}

}
