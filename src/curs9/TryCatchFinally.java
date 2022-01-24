package curs9;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println(name.length());
			
		}catch(NullPointerException e) {
			System.out.println("Null pointer exception occured!");
		}finally {
			System.out.println("Finally block of code!");
		}
		
	}

}
