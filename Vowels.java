package hit.lab2;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the character :");
		
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
			
			System.out.println("vowel");
			break;
			
		case 'e':
			
			System.out.println("vowel");
			break;
		case 'i':
			
			System.out.println("vowel");
			break;
			
		case 'o' :
		
		     System.out.println("vowel");
		     break;
		     
		case 'u' :
			
			  System.out.println("vowel");
			  break;
        default:
        	
        	  System.out.println("consonant");
        	  break;
		     
		}

	}

}
