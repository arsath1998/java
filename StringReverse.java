package hit.lab2;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		String word = scan.nextLine();
		String reverse="";
		
		
		
	     int  i = word.length()-1;
		
		for(int j=0;j<=i;i--) {
			
			reverse=reverse+ word.charAt(i);
			
		
		}
		
		System.out.println(reverse);
		
		if (word.equals(reverse)) {
			
			System.out.println("Given string is palindrome");
			
		}
		else {
			System.out.println("Given string is not palindrome");
		}

	}

}
