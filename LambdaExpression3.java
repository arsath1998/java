package hit.day24;

public class LambdaExpression3 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("muhaideen");
		System.out.println("Reservation center stared working "+t.getName());
        ReservationCounters central = new ReservationCounters();
        
        Thread imran = new Thread(()-> {
        	
        
        
        		synchronized(central) {
        		central.bookTicket(1000);
        		central.giveChange();
        		}
        	
        },"imran");
       imran.start();
       
       
       Thread taqi = new Thread(()-> {
         
        		synchronized(central) {
        		central.bookTicket(500);
        		central.giveChange();
        }
        	
        },"taqi");
       
        taqi.start();
        
	}

}

class ReservationCounters{
	int amt;
	public void bookTicket(int amt) {
		Thread t=Thread.currentThread();
		this.amt=amt;
		String name=t.getName();
		System.out.println(name+"has come to book the ticket..");
		System.out.println(name+"brought.."+amt);
	
		
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to .."+name);
		System.out.println(name+"takes.."+(amt-100));
	


	}

}
