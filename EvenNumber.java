package hit.lab2;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Even number to start the loop");
		
		int num = scan.nextInt();
		
		System.out.println("Enter  the number to stop");
		
		int stop = scan.nextInt();
		
		while(true) {
			if(num%2==0){
				
				System.out.println(num);
				
			}
			else if(num==stop) {
				System.out.println("Its over");
				break;
			}
		num--;	
		}

	}

}
