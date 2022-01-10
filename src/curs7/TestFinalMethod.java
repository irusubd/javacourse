package curs7;

public class TestFinalMethod extends FinalMethod{
	
//	public final void demo() {
//		System.out.println("demo method in FinalMethodClass");
//	}
	
	public void demo2() {
		System.out.println("demo method in FinalMethodClass");
	}
	

	public static void main(String[] args) {

		TestFinalMethod obj = new TestFinalMethod();
		obj.demo();
		obj.demo2();
		
	}

}
