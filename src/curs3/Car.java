package curs3;

public class Car {

	public String brand;
	public String engine;

	public static String type = "Suv";

	public  void setBrand(String brand) {
		this.brand = brand;
	}

	public static void setType(String type) {
		Car.type = type;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Car(String brand, String engine) {
		setBrand(brand);
		setEngine(engine);
	}
	
	public String carDetails() {
		return "All " + brand + " cars are " + engine + " and are of type " + type ;
		
	}

}
