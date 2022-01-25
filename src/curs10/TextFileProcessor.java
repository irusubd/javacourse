package curs10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	/**
	 * Writes a new txt file
	 */
	public void writeFile() {
		try {
			
			FileWriter myFileWriter = new FileWriter("filename.txt");
			myFileWriter.write("Textul meu in fisier\n");
			myFileWriter.close();
			System.out.println("Successful wrote file");
			
			
		}catch(IOException err) {
			
			System.out.println("error occured!");
			err.printStackTrace();
		}
	}
	
	/**
	 * reads from txt file
	 */
	public void readFile() {
		try {
			
			File objFile = new File("filename.txt");
			Scanner myReader = new Scanner(objFile);
			
			while(myReader.hasNextLine()) {
				String text = myReader.nextLine();
				System.out.println(text);
			}
			
		}catch(IOException err) {
			
			System.out.println("error occured!");
			err.printStackTrace();
		}
	}
	
	/**
	 * append text to file
	 */
	public void appendTextToFile() {
		
		try {
			FileWriter myWriter = new FileWriter("filename.txt", true);
			myWriter.write("new line\n");
			myWriter.close();
			
			
		}catch(IOException err) {
			
			System.out.println("error occured!");
			err.printStackTrace();
			
		}
		
	}
	
	/**
	 * deletes file
	 */
	public void deleteFile() {
		
		try {
			
			File myFile = new File("filename.txt");
			myFile.delete();
			System.out.println("file deleted: "+myFile.getName());
			
		}catch(Exception err) {
			
			System.out.println("error occured!");
			err.printStackTrace();
			
		}
	}

}
