package hit.lab2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num = sc.nextInt();
		
		int i=1;
		
		do {
			
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
		}while(i<=10);
		

	}

}
