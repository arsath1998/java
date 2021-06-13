package hit.lab2;

import java.util.Scanner;

public class Fibonecci {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num =sc.nextInt();
		
		int f=0;
		
		int s=1;
		
		int t;
		
		
		
		for(int i=1;i<=num;i++){
			
			System.out.println(f);
			
			t=f+s;
			f=s;
			s=t;
			
	
			
			
		}
		

	}

}
