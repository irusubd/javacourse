package curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExempluArraylist2 {

	public static void main(String[] args) {

		// obiect[] array = new Obiect[3];
		// obiect[] array = {"unu","doi"};

		List<String> arrayList = new ArrayList<>(Arrays.asList("zero", "unu", "doi", "trei", "patru", "cinci"));

		arrayList.add("sase");

		for (String nr : arrayList) {
			System.out.println(nr);
		}
		System.out.println("------------------------------------------");

		// sublist
		arrayList.subList(1, 4).clear();

		for (String nr : arrayList) {
			System.out.println(nr);
		}
		System.out.println("------------------------------------------");

		// contains
		String element = "sase";
		if (arrayList.contains(element)) {
			System.out.println(element + " se afla in lista");
		} else {
			System.out.println(element + " NU se afla in lista");
		}

		// update
		arrayList.set(0, "opt");

		for (String nr : arrayList) {
			System.out.println(nr);
		}
		System.out.println("------------------------------------------");

		// iterator
		Iterator<String> iterator = arrayList.iterator();
		System.out.println(iterator.next());

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
