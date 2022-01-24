package curs9;

public class TestProduct {

	public static void main(String[] args) {

		//Product produs = new Product();
		MobilePhone mobilePhone = new MobilePhone(300, 3);
		System.out.println(mobilePhone.calculatePrice());
		mobilePhone.printProductRating();
		
		Laptop laptop = new Laptop(100, 10, 5);
		System.out.println(laptop.calculatePrice());
		laptop.printProductRating();
		
	}

}
