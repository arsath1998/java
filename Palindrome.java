package hit.lab2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the number ;");
		 
		 int num = sc.nextInt();

		 int rem,res=0;
		 int no=num;
		
		 while(num != 0) {
		       rem=num%10;
		       res=(res*10)+rem;
		       num=num/10;
		}
		                                                               
       
        if(res==no) {
			
			System.out.println("Given number is palindrome");
		}
		else {
			
			System.out.println("Given number is not palindrome");
			
		}
		
	
		

	}

}
