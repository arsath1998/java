package hit.lab2;

import java.util.Scanner;

public class BiggestNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a : ");
		int a = scan.nextInt();
		
		System.out.println("Enter b : ");
		int b = scan.nextInt();
		
		System.out.println("Enter c : ");
		int c = scan.nextInt();
		
		if (a>b || a>c) {
			
			System.out.println("largest number is "+a);
			
		}
		else if(b>c ) {
			System.out.println("Largest number is : "+b);
		}
		else {
			System.out.println("Largest number is : "+c);
		}
	}

}
