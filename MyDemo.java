package hit.day20;

import java.util.Scanner;

public class MyDemo {
	public static void main(String[] args) {
		
		Police police=new Police();
		Medical medical=new Medical();
		Corporation corporation=new Corporation();
		Health health=new Health();
		PassportOffice pass=new PassportOffice();
		
		Seva myGovernment=new Seva();
		Command dc=new Deathcertificate(police, medical, corporation);
		Command hc=new HotelCertificate(health,police,corporation);
		Command pp=new Passport(pass,police);
		
		myGovernment.setCommand(dc, 1);
		myGovernment.setCommand(hc,2);
		myGovernment.setCommand(pp,3);
		
		
		System.out.println("1 for DeathCertificate");
		System.out.println("2 for HotelCertificate");
		System.out.println("3 for Passport");
		System.out.println("Enter the number to choose...:1 or 2 or 3");
		
		Scanner scan = new Scanner(System.in);
		
	    int number = scan.nextInt();
		myGovernment.executeSeva(number);
	}
	}
	class Police{
		public void doInvestigation() {
			System.out.println("investigation done by the police officer....");
		}
		public void hotelInvestigation() {
			System.out.println("Certificate is verified by the police officer");
		}
		public void passportverify() {
			System.out.println("Passport is verified by the police officer");
		}
	}
	class Medical{
		public void doPostMortem() {
			System.out.println("post mortem done by the medical department....");
		}
	}
	class Corporation{
		public void doGiveCertificate() {
			System.out.println("death certificate done...");
		}
		public void dohotelcertificate() {
			System.out.println("Hotel certification done");
		}
	}
	class PassportOffice{
		public void  dopassport() {
			System.out.println("passport is verified by the passportofficer");
		}
	}
	class Health{
		public void healthdepartment() {
			System.out.println("certificate is vrified by the health department officer");
		}
	}
	interface Command{
		public void execute();
	}
	class Deathcertificate implements Command{
		Police police;Medical medical;Corporation corporation;
		
		public Deathcertificate(Police police, Medical medical, Corporation corporation) {
			this.police = police;
			this.medical = medical;
			this.corporation = corporation;
		}
		public void execute() {
			System.out.println("process of death certificate started by seva Department...");
			police.doInvestigation();
			medical.doPostMortem();
			corporation.doGiveCertificate();
			System.out.println(" Take the death certificate ..............");
		}
	}
    class HotelCertificate implements Command {
    	Health health;Police police;Corporation corporation;
    	
    	public HotelCertificate(Health health,Police police,Corporation corporation) {
    		this.health=health;
    		this.police=police;
    		this.corporation=corporation;
    	}
    	public void execute() {
    		System.out.println("process of health certificate is started by seva Department...");
    		health.healthdepartment();
    		police.hotelInvestigation();
    		corporation.dohotelcertificate();
    		System.out.println("Take the Health certificate");
    	}
    	
    }
    class Passport implements Command {
    	PassportOffice pass ; Police police;
    	
    	public Passport(PassportOffice pass,Police police) {
    		this.pass=pass;
    		this.police=police;
    		
    		
    	}
    	public void execute() {
    		System.out.println("process of passport verification is started");
    		pass.dopassport();
    		police.passportverify();
    		System.out.println("Take the passport");
    	}
    	
    }
	
	class DummyCommand implements Command{
		@Override
		public void execute() {
			System.out.println("I am dummy yet to be operational................");
		}
	}
	class Seva{
		Command c[]=new Command[5];
		public Seva() {		
			for(int i=0;i<c.length;i++) {
				c[i]=new DummyCommand();
			}
		}
		public void executeSeva(int slot) {
			c[slot].execute();
		}
		public void setCommand(Command c,int slot) {
			this.c[slot]=c;
		}
	}


