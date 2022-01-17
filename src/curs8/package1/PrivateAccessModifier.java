package curs8.package1;

public class PrivateAccessModifier {

	/**
	 * Scopul Private este limitat la clasa in care se afla
	 * Clasa sau interfata nu pot fi declarate ca Private
	 * 
	 * Same class:						yes
	 * Subclass in acelasi pachet:		no		
	 * Alta clasa in acelasi pachet:	no
	 * Subclass in alt pachet:			no
	 * Alta clasa in alt pachet:		no
	 * 
	 */
	
	private static String mesaj = "Hello";
	public static String word = "there";
	
	public static String getMesaj() {
		return mesaj;
	}
	
	
	
}
