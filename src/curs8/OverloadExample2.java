package curs8;

public class OverloadExample2 {
	
	public static void main(String[] args) {
		System.out.println(days(3));
		System.out.println(days("miercuri"));
	}
	
	
	public static String days(int day) {
		switch(day) {
		case 1:
			return "luni";
		case 2:
			return "marti";
		case 3:
			return "miercuri";
		case 4:
			return "joi";
		case 5:
			return "vineri";
		case 6:
			return "sambata";
		case 7:
			return "duminica";
		default:
			return "nr invalid";	
		}
	}
	
	public static int days(String day) {
		switch(day) {
		case "luni":
			return 1;
		case "marti":
			return 2;
		case "miercuri":
			return 3;
		case "joi":
			return 4;
		case "vineri":
			return 5;
		case "sambata":
			return 6;
		case "duminica":
			return 7;
		default:
			return 0;	
		}
	}

}
