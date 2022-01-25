package curs10;

import java.io.IOException;

public class TestPropertiesFileProcessor {

	public static void main(String[] args) throws IOException {

		PropertiesFileProcessor propFile = new PropertiesFileProcessor();
		//propFile.writePropertiesFile();
		propFile.readProperties("pass");
	}

}
