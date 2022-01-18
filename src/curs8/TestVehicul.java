package curs8;

public class TestVehicul {

	public static void verificaMotorizarea(Vehicul obiect) {
		System.out.print(obiect.nume() + " > ");
		System.out.println(obiect.motorizare());
	}

	public static void main(String[] args) {

		Vehicul bike = new Bicicleta("Cube", 0, 15);
		Vehicul car = new Masina("Ford", 3, 50);

		verificaMotorizarea(bike);
		bike.detaliiVehicul();

		verificaMotorizarea(car);
		car.detaliiVehicul();

	}

}
