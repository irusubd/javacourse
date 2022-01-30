package curs10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class Stoc {

	public boolean isStoc(String leguma) throws IOException {

		InputStream inputStream = new FileInputStream("legume.properties");
		Properties prop = new Properties();
		prop.load(inputStream);
		String[] stocLegume = prop.keySet().toArray(new String[0]);
		inputStream.close();

		if (Arrays.asList(stocLegume).contains(leguma)) {
			return true;
		} else {
			return false;
		}

	}

}
