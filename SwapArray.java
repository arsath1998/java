package hit.lab2;

public class SwapArray {

	public static void main(String[] args) {
		
		
		 int arr1[]= {5,10,15,20,25};
		 
		 int arr2[]= {25,35,45,65,100};
		  
		 int size = 5;
		 
		 System.out.println("Before swapping...");
		 
		 for(int i=0;i<size;i++) {
			 
		             System.out.print(arr1[i]+" ");
		             System.out.println(arr2[i]+" ");
		 }
		 
		  System.out.println("After swapping....");
		 
        for(int i=0;i<size;i++) {
	    	
	    arr1[i]=arr1[i]+arr2[i];
	    
	    arr2[i]=arr1[i]-arr2[i];
	    
	    arr1[i] =arr1[i]-arr2[i];
	    
	    
	     System.out.print(arr1[i]+" ");
	     System.out.println(arr2[i]+" ");
	    
	    
	    
	   
	    
	    }
        
	
	    
	   
	}
}

