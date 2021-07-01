package hit.day22;

public class New {
	public static void main(String[] args) {
		Thread t = new Thread(new Runeg("A"));
		t.start();
		Thread t1 = new Thread(new Runeg("B"));
		t1.start();
		
	}
	}
class Runeg implements Runnable{
	private String tname;
	
	public Runeg(String name) {
		tname=name;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread" + tname + " :"+i);
		}
	}
}