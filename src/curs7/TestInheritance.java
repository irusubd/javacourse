package curs7;

public class TestInheritance {

	public static void main(String[] args) {

		TesterAutomat tester = new TesterAutomat();

		tester.setLimbajProgramare("Java"); // clasa TesterAutomat
		tester.setDepartament("Quality Assurance"); // clasa Tester
		tester.setSeniority("Junior"); // clasa tester
		tester.setEmail("matei@matei.com"); // clasa angajat
		tester.setName("Matei"); // clasa angajat

		System.out.println("Numele angajatului este " + tester.getName() + " face parte din departamentul "
				+ tester.getDepartament() + " este de nivel " + tester.getSeniority() + " si foloseste "
				+ tester.getLimbajProgramare() + " pentru a scrie teste");

	}

}
