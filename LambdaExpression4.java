package hit.day24;

public class LambdaExpression4 {

	public static void main(String[] args) {
CounsellingHalls university = new CounsellingHalls();
		
		Thread imran=new Thread(()->{
			
		
			
					if(Thread.currentThread().getName().equals("imran")) {
					 university.table1();university.table2();
				}
					else if(Thread.currentThread().getName().equals("taqi")) {
						university.water();
						
					}
			
		},"imran");
		imran.start();
				
		Thread taqi=new Thread(()->{
			
		
		

					if(Thread.currentThread().getName().equals("imran")) {
					 university.table1();university.table2();
				}
					else if(Thread.currentThread().getName().equals("taqi")) {
						university.water();
						
					}
			
		},"taqi");
		taqi.start();
					
		


}
}
class CounsellingHalls{
	synchronized  public void table1() {
		System.out.println("entered table 1.."+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
	}
	synchronized public void table2() {
		System.out.println("entered table 2.."+Thread.currentThread().getName());
	}
	public void water() {
		System.out.println(Thread.currentThread().getName()+" entered water area to drink water");
		


	}

}
