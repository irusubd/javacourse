package curs11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		boolean verificaSet = set.isEmpty();
		System.out.println("Verifica daca setul este gol sau nu: " + verificaSet);
		
		set.add("rosu");
		
		boolean verificaSet2 = set.isEmpty();
		System.out.println("Verifica daca setul este gol sau nu: " + verificaSet2);
		
		System.out.println(set.size());
		
		set.add("mov");
		set.add("galben");
		set.add("verde");
		
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("------------------");
		
		set.remove("galben");
		
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		set.add("negru");
		
		System.out.println(set.contains("negru"));
		
		System.out.println("------------------");
		
		for (String x: set) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		set.clear();
		
		for (String x: set) {
			System.out.println(x);
		}
		
	}

}
