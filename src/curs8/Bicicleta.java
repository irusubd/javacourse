package curs8;

public class Bicicleta extends Vehicul {

	public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}

	@Override
	public String nume() {
		return "Bicicleta";
	}

	@Override
	public String motorizare() {
		return "Pedale";
	}

	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru vehicul " + getBrand() + " este " + getNivelPoluare()
				+ " si viteza medie atinsa este de " + getVitezaMedie() + " km/h");
	}

}
