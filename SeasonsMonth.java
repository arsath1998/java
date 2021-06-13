package hit.lab2;

import java.util.Scanner;

public class SeasonsMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the months in number to know the season ");
		
		int month = sc.nextInt();
		
		switch (month) { 
		  case 1: 
			
		    System.out.println("janaury is a Winter season"); 
		    break; 
		  case 2: 
			 
		    System.out.println("Febraury is a Spring season"); 
		    break; 
		  case 3: 
			System.out.println("March is a summer season"); 
		     
		    break; 
		  case 4: 
			System.out.println("April is a summer season"); 
		   
		    break; 
		  case 5: 
			
		    System.out.println(" May is a Summer season"); 
		    break; 
		  case 6: 
			 
		    System.out.println("June is a Monsoon season"); 
		    break; 
		  case 7: 
		     
		    System.out.println(" July is a Monsoon season"); 
		    break; 
		 case 8: 
		     
		    System.out.println("August is a Monsoon season"); 
		    break; 
		 case 9: 
		    
		    System.out.println(" september is a Monsoon season"); 
		    break; 
		 case 10: 
		    System.out.println("October is a winter season"); 
		    
		    break; 
		 case 11: 
		    System.out.println("November is a winter season"); 
		    System.out.println("Winter"); 
		    break; 
		 case 12: 
		    System.out.println("December is a winter season"); 
		   
		    break; 
	    	 
	    }
	    
		
		
		

	}

}
