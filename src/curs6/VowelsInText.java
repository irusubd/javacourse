package curs6;

public class VowelsInText {

	public static void main(String[] args) {

		String text = "Eu invat Java";
		String vowels = "aeiou";
		int found = 0;

		for (int i = 0; i < text.length(); i++) {
			if (vowels.contains(String.valueOf(text.toLowerCase().charAt(i)))) {
				found++;
			}
		}
		
		System.out.println("Vocale: " + found);

	}

}
