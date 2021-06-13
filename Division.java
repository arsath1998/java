package hit.lab2;

public class Division {

	public static void main(String[] args) {
		
		
		
		Division obj = new Division();
		
		obj.div(22, 10, 22.25);
		
	}
	
	void div(int a,int  b,double c) {
		
		double div1 = a/b;
		double div2 =c/b;
		
		System.out.println(""+div1);
		System.out.println(""+div2);	
		
		
	}
		
		
}
