package curs8.package1;

public class PrivateAccessModifierTest extends PrivateAccessModifier{
	
	public static void main(String[] args) {
		
		//System.out.println(mesaj);
		System.out.println(word);
		System.out.println(getMesaj());
		
		PrivateAccessModifier obj = new PrivateAccessModifier();
		System.out.println(obj.getClass());
		
	}

}
