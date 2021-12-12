package curs4;

public class Palindrome {
	
	public void checkIfWordIsPolindrome(String cuvant) {
		
		String cuvantIntors ="";
		
		for(int i = cuvant.length()-1; i>=0; i--) {
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
		}
		
		System.out.println("cuvant: " + cuvant);
		System.out.println("intors: " + cuvantIntors);
		
		if(cuvantIntors.equals(cuvant)) {
			System.out.println("Cuvantul este palindrome");
		}else {
			System.out.println("Cuvantul NU este palindrome");
		}
	}

}
