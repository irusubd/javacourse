package curs4;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		/**
		 * && --> short circuit
		 * & --> and
		 * 
		 * (x!=0) & (1/x>5) evalueaza (x!=0), evalueaza (1/x>5), apoi aplica conditia &
		 * (x!=0) && (1/x>5) evalueaza (x!=0), daca este true evalueaza (1/x>5) 
		 * 
		 * a | b --> evalueaza A, evalueaza b, apoi face |
		 * a || b --> evalueaza A si doar daca A este false evalueaza B
		 * 
		 */
		
		int x = 0;
		
		if((x!=0) & (1/x>5)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
