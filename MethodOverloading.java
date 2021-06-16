package hit.lab2;

public class MethodOverloading {

	public static void main(String[] args) {
	     Arithmetic obj = new Arithmetic();
         obj.calculation(2, 4);
         obj.calculation(2, 3,4,5);
         obj.calculation(9, 1,7,6,3);
         obj.calculation(6, 2,1);
	}

}
class Arithmetic{
	
	void calculation(int a,int b,int c,int d) {
		
		int add = a+b+c+d;
		System.out.println("Addition of numbers is : "+add);
	}
	
	void calculation (int a,int b,int c) {
		
		int sub = a-b-c;
		
		System.out.println("Subtraction of two numbers is : "+sub);
		
	}
	
	void calculation(int a,int b ,int c ,int d,int e) {
		
		
		int mul = a*b*c*d*e;
		
		System.out.println("Multiplication of threee numbers is "+mul);
		
		
	}
	void calculation(int a,int b) {
		
		double div = a/b;
		
		System.out.println("Division oftwo numbers is : "+div);
		
	}
	
	
}