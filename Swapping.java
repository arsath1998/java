package hit.lab2;

public class Swapping {

	public static void main(String[] args) {
		
		Swapping obj = new Swapping();
		
		obj.swap(50,100);
		
		

	}
	void swap(int a, int b) {
		
		 System.out.println("Before swapping of two numbers is "+a+" "+b);
		
		 a = a + b;
		 
		 b = a - b;
		 
		 a= a - b ;
		 
		 System.out.println("After swapping of two numbers is "+a+" "+b);
		
		
	}

}
