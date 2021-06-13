package hit.lab2;

public class Operators {

	public static void main(String[] args) {
		
		Operators obj = new Operators();
		obj.cal(5,10);
		
	}
	
	void cal(int a,int b) {
		
		int Addition = a += b;
		
		int subtraction = a -= b;
		
		int multiplication = a *= b ;
		
		double division = a /= b ;
		
		System.out.println("Addition of two numbers is......  "+ Addition);
		
		System.out.println("subtraction of two numbers is.... "+subtraction);
		System.out.println("multiplication of two numbers is......   "+ multiplication);
		System.out.println("Division  of two numbers is......   "+ division);
	  	
	}

}
