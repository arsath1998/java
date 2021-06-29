package hit.day20;

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception {
		Thread t =Thread.currentThread();
		t.setName("this is my main method");
		t.setPriority(10);
		System.out.println("Now thread will sleep for 5 seconds");
		vaccinationCentre();
		System.out.println("start the class");
		for(int i=0;i<5;i++) {
			System.out.println(i
					);
			Thread.sleep(1000);
		}

	}
	static void vaccinationCentre() throws Exception{
		System.out.println("method called");
		Thread.sleep(5000);
	}

}
