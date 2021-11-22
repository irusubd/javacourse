package curs2;

public class Rectangle {
	
	//variabile de clasa
	private int lenght;// au doar valoarea default = 0
	private int width;
	private int bigArea;
	
	
	//constructor
	public Rectangle() {
		lenght = 5;
		width = 6;
	}
	
	//alt constructor// cu parametri
	public Rectangle(int lenght, int width) {
		setLenght(lenght);
		setWidth(width);
	}
	
	//alt constructor cu mai multi parametri
	public Rectangle(int length, int width, int bigArea) {
		setLenght(length);
		setWidth(width);
		this.bigArea = bigArea;
	}
		
	//Rectangle rectangle3 = new Rectangle(3, 3);
	//Rectangle rectangle4 = new Rectangle(3, 3, 40);
	
	
	public void setLenght(int lenght) {
		this.lenght = lenght;
		//ia variabila lenght de la nivel de clasa (this.lenght) si ii atribuie (=) valoarea pe care o primeste 
		//ca si parametru al metodei
	}	
	 // clasa Rectangle (2 variabile) ==> dormitor ==> lenght 2 si width 4
	 // clasa Rectangle (2 variabile) ==> baie ==> lenght 6 si width 8
	//  dormitor.setLenght(2); // pentru dormitor valoarea lui lenght = 2 //o locatie dif in memorie S1
	//  baie.setLenght(6);  //pentru baie valoarea lui lenght  = 6  //S2
	//baie.getLenght();
	
	
	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public int calculateArea() {
		return lenght*width;
	}
	
	public int calculateNumberOfRectangles() {
		return bigArea/calculateArea();
	}

}
