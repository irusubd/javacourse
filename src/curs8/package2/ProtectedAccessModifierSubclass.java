package curs8.package2;

import curs8.package1.ProtectedAccessModifier;

public class ProtectedAccessModifierSubclass extends ProtectedAccessModifier{
	
	public static void main(String[] args) {
		
		ProtectedAccessModifierSubclass obj = new ProtectedAccessModifierSubclass();
		System.out.println(obj.unu);
		obj.printMesaj();
		
	}

}
