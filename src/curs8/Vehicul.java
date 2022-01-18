package curs8;

public class Vehicul {

	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;

	public String getBrand() {
		return brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public Vehicul(String brand, int nivelPoluare, int vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie = vitezaMedie;
	}

	public String nume() {
		return "";
	}

	public String motorizare() {
		return "";
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru vehicul Dacia este 5 si viteza medie atinsa este de 180 km/h");
	}

}
