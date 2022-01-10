package curs7;

public class Square extends Shape{

	String shapeName = "Square";
	String shapeColor = "Black";
	
	public Square() {
		System.out.println("Square class constructor");		
	}
	//constructor cu param
	public Square(String color, String name) {
		super(color, name);
	}
	
	public void displayDetails() {
		System.out.println("Shape name is: " + super.shapeName + " and the color is: " + super.shapeColor);
	}

}
