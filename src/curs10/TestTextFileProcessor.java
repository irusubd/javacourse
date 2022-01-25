package curs10;

public class TestTextFileProcessor {

	public static void main(String[] args) {

		TextFileProcessor  textFile = new TextFileProcessor();
		textFile.writeFile();
		textFile.readFile();
		textFile.appendTextToFile();
		System.out.println("------");
		textFile.readFile();
		textFile.deleteFile();
	}

}
