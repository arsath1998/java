package hit.lab2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the choice add / sub / mul / div");
		
		String choice = scan.nextLine();
		
		System.out.println("Enter the number 1 : ");
		
		int number1 = scan.nextInt();
		
		System.out.println("Enter the number2 : ");
		
		int number2 = scan.nextInt();
		
		switch(choice) {
		
		case "add":
			
			double add = number1 + number2 ;
			System.out.println("Addition of two numbers is :+result);"+add);
			break;
			
		case "sub":
			
			double sub = number1 - number2 ;
			System.out.println("Subtraction of two numbers is :"+sub);
			break;
		case "mul":
			
			double mul = number1 * number2 ;
			System.out.println("Multiplication of two numbers is : "+mul);
			break;
		case "div":
			double div = number1/number2 ;
			System.out.println("Divisio of two numbers is :"+div);
			break;
		default:
			
			System.out.println("Invalid input");
			break;
			
			
			
			
		}

	}

}
