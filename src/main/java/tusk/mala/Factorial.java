package tusk.mala;

import java.lang.reflect.Array;
import java.util.Scanner; 

public class Factorial {

	public static void main(String[]args){
		
		//System.out.println("Give a number you want to fact.");
		//Scanner scanner = new Scanner(System.in);
		//int factScan = scanner.nextInt();
		
		  int factStore = 5;
		  int product = 1;

			
			while (factStore > 1) {
				product =  product * factStore ;
				factStore--;
				

				

				
			System.out.println(product);

		}
		System.out.println(product);
	}
}
