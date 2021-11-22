package curs2;

public class TestRectangle {

	public static void main(String[] args) {

		
		//System.out.println("rectangle 1: " +rectangle1.calculateArea());
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setLenght(6);
		rectangle1.setWidth(2);
		
		System.out.println("rectangle 1.1: " +rectangle1.calculateArea());
		
		Rectangle rectangle2 = new Rectangle();//Constructor;
		System.out.println("rectangle 2: " +rectangle2.calculateArea());
		
		
		Rectangle rectangle3 = new Rectangle(3, 3);
		System.out.println("rectangle 3: " +rectangle3.calculateArea());
		
		Rectangle rectangle4 = new Rectangle(5, 2, 400);
		System.out.println(rectangle4.calculateNumberOfRectangles());
		
	}

}
