package hit.lab2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int number = sc.nextInt();
		
		int sum,result =0;
		
		while(number != 0) {
			
			sum = number%10;
			
			result = result + sum;
			
			number = number/10;
			
		}
		
		System.out.println("sum of digits "+result);
		   

	}

}
