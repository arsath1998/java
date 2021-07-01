package hit.day22;

public class TwoThreadOneTask {

	public static void main(String[] args) {
		Canon bofors=new Canon();
		
		
		Thread naina=new Thread(new ShootingTask(bofors),"naina");
		Thread shabeer=new Thread(new ShootingTask(bofors),"shabeer");
		
		naina.start();
		shabeer.start();
	}
}
class ShootingTask implements Runnable{
	Canon gun;
	public ShootingTask(Canon gun) {
		this.gun=gun;
	}
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("naina")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
		}
		else if(t.getName().equals("shabeer")) {
			for(int i=0;i<5;i++) {
				gun.shoot();
			}
		}
	}
}
class Canon{
	boolean flag;
	synchronized public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
			try {
				wait();
			}catch(Exception e) {
		}
		}
		System.out.println(name+" fills the gun.......");
		flag=true;
		notify();
	}
	
	synchronized public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {
				wait();
			}catch(Exception e) {
		}
		}
		System.out.println(name+" shoot the gun...........");
		flag=false;
		notify();
}
}