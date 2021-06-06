package hit.lab1;

public class SwapNumbers {

	public static void main(String[] args) {
		int first =120 , second =220;
		
		System.out.println("--Before Swapping--");
		System.out.println("First number = "+first); 
		System.out.println("second number ="+second);
		
		first= first - second ;
		second = first + second;
		first = second - first ;
		
		System.out.println("--After Swapping--");
		System.out.println("First number ="+first);
		System.out.println("second number ="+second);

	}

}
