package hit.lab2;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num = scan.nextInt();
		
          boolean prime = true;
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				
				
				 prime = false;
				
				 break;
				
				
			}
			

		}
		if(prime) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");
		}

	}

}
