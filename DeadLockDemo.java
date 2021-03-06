package hit.day22;

public class DeadLockDemo {

	public static void main(String[] args) {
		Frog frog=new Frog();
		Crane crane=new Crane();
		
		new Thread(new Runnable() {
			public void run() {
				crane.eat(frog);
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				frog.escape(crane);
			}
		}).start();
         
	}

}
class Crane{
	synchronized public void eat(Frog frog) {
		System.out.println();
		frog.leaveCallByCrane();
	}
	synchronized public void leaveCalledByFrog() {
		
	}
}class Frog{
	synchronized public void escape(Crane crane) {
		crane.leaveCalledByFrog();
	}
	synchronized public void leaveCallByCrane() {
		
	}
}