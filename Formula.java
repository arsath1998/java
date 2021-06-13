package hit.lab2;

public class Formula {

	public static void main(String[] args) {
		int r = 25;
		int h = 10;
		int mass = 5;
		int Acceleration = 3;
		int velocity = 2;
		int height = 4;
		
		double Area =( Math.PI * (r*r) )+ (2 * Math.PI * h );
		
		double E = mass*(Acceleration*(height+(velocity*velocity)/2));
		
		System.out.println("Area is :"+Area);
		
		System.out.println("Energy is.."+E);
		

	}

}
