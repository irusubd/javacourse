package curs10;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws ParseException {

		JsonProcesor jsonProcessor = new JsonProcesor();
		
		//jsonProcessor.writeJsonFile();
		jsonProcessor.readJsonFile();
	}

}
