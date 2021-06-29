package hit.day20;
import java.util.Date;
public class ThreadDemo2 {

	public static void main(String[] args) {
		 
		VaccinationCenter vc = new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("shoiab");
		System.out.println(new Date());
		System.out.println("Before coming to class");
		Thread Kala = new Thread(new JobToKala(vc),"Kala");
		Kala.start();
		System.out.println("Take class for 7 to 9 Golden Batch");

	}

}
class JobToKala implements Runnable{
	VaccinationCenter vc;
	public JobToKala(VaccinationCenter vc) {
		this.vc=vc;
	}
	@Override
	public void run() {
		System.out.println("The job given to Kala is executed fro this method");
		try {
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
class VaccinationCenter{
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"..standing in queue for getting token");
		Thread.sleep(5000);
		System.out.println("token received "+new Date());
	}
}