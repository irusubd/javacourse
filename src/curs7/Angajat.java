package curs7;

public class Angajat {
	
	private String name;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * obj.name = "Tester" --> daca var e private nu va mai functiona
	 * obj.setName = "Tester"
	 */
	

}
