package curs8.package1;

class DefaultAccessModifier {

	/**
	 * daca nu mentionam niciun access modifier se considera default
	 * 
	 * Scopul lui este limitat la packetul in care se afla
	 * 
	 * Same class:						yes
	 * Subclass in acelasi pachet:		yes		
	 * Alta clasa in acelasi pachet:	yes
	 * Subclass in alt pachet:			no
	 * Alta clasa in alt pachet:		no
	 * 
	 */
	
	String mesaj;
	
	void printMesaj() {
		System.out.println("Default modifier");
	}
	
	public static void main(String[] args) {
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.printMesaj();
	}
	
}
