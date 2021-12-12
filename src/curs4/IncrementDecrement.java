package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		//num1++ --> post increment
		//num1 = num1+1
		//++num1 --> pre increment
		int num1 = 10;
		System.out.println("valoarea lui num1 inainde de increment: " + num1);
		System.out.println("valoarea lui num1 in postincrement: " + num1++);
		System.out.println("valoarea lui num1 dupa postincrement: " + num1);
		
		int num2 = 10;
		System.out.println("valoarea lui num2 in preincrement: " + ++num2);
		System.out.println("valoarea lui num2 dupa preincrement: " + num2);
		
		int num3 = 5;
		num3++; //num3 = 6
		++num3;
		int num4 = num3 + 1;
		System.out.println(num4);
		
		//pre incr
		++num3;
		//post incr
		num3++;
		//pre decr
		--num3;
		//post decr
		num3--;

	}

}
