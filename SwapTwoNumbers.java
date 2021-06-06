package hit.lab1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int first = 120 ,second = 220;
		System.out.println("--Before Swaping--");
		System.out.println("First number = "+ first);
		System.out.println("Second number = "+ second);
		
		int temporary = first ;
		first = second ;
		second = temporary ;
		
		
		
        System.out.println("-After swapping--");
        System.out.println("First number ="+ first);
        System.out.println("second number ="+ second);
        
	}

}
