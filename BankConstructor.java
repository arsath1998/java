package hit.lab2;

public class BankConstructor {
    public static void main(String[] args) {
		

		System.out.println("..........WELCOME TO INDIAN OVERSEAS BANK..........");
		  
		check obj = new check();
		
		obj.check("Mohamed Arsath A","Student Account", 24681357, 2000);
		obj.check(100);
		obj.check();

	}

}
class check{

	  String Name,Type;
	  int Accno , Balance;
		
		void check(String a,String b,int c,int d) {
			Name =  a;
			Type = b;
			Accno = c;
			Balance = d;
		}
		void check(int amount) {
			
			Balance = Balance +amount ;
		}
		void check(){
			System.out.println("      "+Name+ " Account balance is "+Balance+"Rupees");
			
		}
		
}


