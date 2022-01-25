package curs10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProcesor {
	
	public void writeJsonFile() {
		JSONObject obj = new JSONObject();
		obj.put("name", "testUser");
		
		JSONArray list = new JSONArray();
		list.add("Ob1");
		list.add("Ob2");
		list.add("Ob3");
		list.add("Ob4");
		
		obj.put("list obiecte", list);
		
		try (FileWriter file = new FileWriter("test.json")){
			file.write(obj.toJSONString());
			
		}catch(IOException e) {
			System.out.println("error!");
			e.printStackTrace();
		}
		System.out.println(obj);
	}
	
	public void readJsonFile() throws ParseException {
		JSONParser parser = new JSONParser();
		
		try {
			
			Reader reader = new FileReader("test.json");
			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			System.out.println(jsonObject);
			
			String key = (String) jsonObject.get("name");
			System.out.println(key);
			
			JSONArray obj = (JSONArray) jsonObject.get("list obiecte");
			Iterator<String> it = obj.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
			
			
		}catch(IOException e) {
			System.out.println("error!");
			e.printStackTrace();
		}
		
	}

}
