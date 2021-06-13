package hit.lab2;

public class AreaPerimeter {

	public static void main(String[] args) {
	     
		AreaPerimeter obj = new AreaPerimeter();
		
		obj.square(5);
		obj.rectangle(10, 15);

	}
	
	void square(int a ) {
		
		int Area = a * a ;
		
		int perimeter = 4*a ;
		
		System.out.println("Area of square is "+Area);
		
		System.out.println("perimeter of square is "+perimeter);
		
	}
	
	void rectangle(int l, int b) {
		
		int Area = l * b ;
		 
		int perimeter = 2*(l+b);
		
		System.out.println("Area of rectangle is "+Area);
		
		System.out.println("perimeter of rectangle is "+perimeter);
	}

}
