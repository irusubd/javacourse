package curs8;

public class Masina extends Vehicul {

	public Masina(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}

	@Override
	public String nume() {
		return "Masina";
	}

	@Override
	public String motorizare() {
		return "Benzina";
	}

	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru vehicul " + getBrand() + " este " + getNivelPoluare()
				+ " si viteza medie atinsa este de " + getVitezaMedie() + " km/h");
	}

}
