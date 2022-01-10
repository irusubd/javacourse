package curs7;

public class Shape {

	String shapeName = "generic shape";
	String shapeColor = "generic color";
	public String shapeSize = "100";
	private String shapeWeight = "200";

	public Shape() {
		System.out.println("Shape class constructor");
	}
	//constructor cu param
	public Shape(String color, String name) {
		this.shapeColor = color;
		this.shapeName = name;

	}

	public void displayDetails() {
		System.out.println("Shape name is: " + shapeName + " and the color is: " + shapeColor);
	}

}
