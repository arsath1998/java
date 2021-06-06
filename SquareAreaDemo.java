package hit.lab1;

import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the side of square:");
		
		Scanner scanner =new Scanner(System.in);
		
		double side = scanner.nextDouble();
		
		double area = side*side;
		System.out.println("Area of Square is:"+area);
		

	}

}
