package curs3;

public class TestCar {

	public static void main(String[] args) {
		Car obiect = new Car("Toyota", "electric");
		System.out.println(obiect.carDetails());
		
		Car obiect2 = new Car("Mazda", "petrol");
		
		Car.setType("Sedan");
		
		System.out.println(obiect2.carDetails());
		System.out.println(obiect.carDetails());
		

	}

}
