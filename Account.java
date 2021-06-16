package hit.lab2;

public class Account {

	public static void main(String[] args) {
		
		System.out.println("..........WELCOME TO INDIAN OVERSEAS BANK..........");
		  
		bank obj = new bank();
		
		obj.initial("Mohamed Arsath A","Student Account", 24681357, 2000);
		obj.deposit(10000);
		obj.display();

	}

}
 class bank{

	  String Name,Type;
	  int Accno , Balance;
		
		void initial(String a,String b,int c,int d) {
			Name =  a;
			Type = b;
			Accno = c;
			Balance = d;
		}
		void deposit(int amount) {
			
			Balance = Balance +amount ;
		}
		void display(){
			System.out.println("      "+Name+ " Account balance is "+Balance+"Rupees");
			
		}
		
}