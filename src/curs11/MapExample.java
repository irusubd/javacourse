package curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		boolean isEmpty = map.isEmpty();
		System.out.println("Map is empty ? :" + isEmpty);
		System.out.println("Map size ? :" + map.size());
		System.out.println("---------------------------------");

		map.put("T", "Tester");
		map.put("M", "Manager");
		map.put("D", "Developer");
		map.put("P", "ProductOwner");

		boolean checkKey = map.containsKey("T");
		System.out.println("Contine key ? :" + checkKey);
		
		boolean checkValue = map.containsValue("Developer");
		System.out.println("Contine value ? :" + checkValue);
		System.out.println("---------------------------------");
		
		for(String key:map.keySet()) {
			System.out.println(key);
		}
		
		for(String value:map.values()) {
			System.out.println(value);
		}
		System.out.println("---------------------------------");
		
		map.remove("M");
		for(String value:map.values()) {
			System.out.println(value);
		}

	}

}
