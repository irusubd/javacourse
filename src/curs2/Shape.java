package curs2;

public class Shape {

	public void calculateSquareArea(int lenght) {
		System.out.println("The area of the square is: " + lenght * lenght);
	}

	public void calculateRectangleArea(int lenght, int width) {
		System.out.println("The area of the rectangle is: " + lenght * width);
	}

	public Shape(int lenght) {
		calculateSquareArea(lenght);
	}

	public Shape(int lenght, int width) {
		calculateRectangleArea(lenght, width);
	}

	public Shape(double radius) {
		System.out.println("The area of the circle is: " + radius * radius * Math.PI);
	}

}
