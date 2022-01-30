package curs10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Legume {

	public String getCalorii(String leguma) throws IOException {
		InputStream inputStream = new FileInputStream("legume.properties");
		Properties prop = new Properties();
		prop.load(inputStream);
		return prop.getProperty(leguma);
	}

}
