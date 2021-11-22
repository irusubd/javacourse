package curs2;

public class MethodExample {

	/*
	 * 1. numar de camere dinamic
	 * 2. calcul de mp al fiecarei camere 
	 * 3. nr total de mp
	 */
	
	//Upper camel case --> CuvantAltCuvant
	//lower camel case --> cuvantAltCuvant
	
	
	
	
	int numarTotal;
	
	public static void main(String[] args) {

		//fara metode
		//room1
		int lenght =4;
		int width  =2;
		int room1area = lenght*width;
		System.out.println("Aria camerei 1 este " + room1area);
		//room2
		int lenght2 =5;
		int width2  =6;
		int room2area = lenght2*width2;
		System.out.println("Aria camerei 2 este " + room2area);
		
		int nrTotalMp = room1area + room2area;
		System.out.println(nrTotalMp);
		
		MethodExample room =  new MethodExample();
		MethodExample room2 = new MethodExample();
		MethodExample room3 = new MethodExample();

		int hol = room.calculateArea(2, 3); //6
		int baie = room2.calculateArea(4, 4);//16
		
		System.out.println("Nr total : " + calculeazaNrTotal(hol, baie, 45));

	}
	
	public int calculateArea(int lenght, int width) {
		return lenght * width;
	}
	
	public static int calculeazaNrTotal(int...rooms) {
		int result = 0;
		
		for(int room : rooms) {
			result = result+ room;
			//result = 0 + 6;
			//result = 6+ 16
			//.....
			
			
		}
		
		
		return result;
	}


}
